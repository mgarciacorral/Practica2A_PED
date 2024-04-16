package Librerias.EstructurasDatos.Lineales;

import Librerias.EstructurasDatos.Modelos.I_Cola;

public class ArrayCola<E> implements I_Cola<E>
{
    private E[] array;
    private int inicio;
    private int fin;
    private int talla;

    public ArrayCola()
    {
        this(10);
    }

    public ArrayCola(int capacidad)
    {
        array = (E[]) new Object[capacidad];
        inicio = 0;
        fin = -1;
        talla = 0;
    }

    public void encolar(E elemento)
    {
        if (talla == array.length)
        {
            this.aumentarCapacidad();
        }
        fin = (fin + 1) % array.length;
        array[fin] = elemento;
        talla++;
    }

    public E desencolar()
    {
        if (this.esVacia())
        {
            return null;
        }
        E elemento = array[inicio];
        inicio = (inicio + 1) % array.length;
        talla--;
        return elemento;
    }

    public E primero()
    {
        if (this.esVacia())
        {
            return null;
        }
        return this.array[inicio];
    }

    public int getTalla()
    {
        return this.talla;
    }

    public boolean esVacia()
    {
        return this.talla == 0;
    }

    private void aumentarCapacidad()
    {
        E[] nuevoArray = (E[]) new Object[array.length + 1];
        for (int i = 0; i < talla; i++)
        {
            nuevoArray[i] = array[(inicio + i) % array.length];
        }
        array = nuevoArray;
        inicio = 0;
        fin = talla - 1;
    }

    public void toStringIterativo()
    {
        int index = inicio;

        for (int i = 0; i < talla; i++) {
            System.out.println(array[index].toString());
            index = (index + 1) % array.length;
        }
    }

    public void reverse()
    {
        if(!esVacia())
        {
            E elemento = desencolar();
            reverse();
            encolar(elemento);
        }
    }

    public ArrayCola<E> clone()
    {
        ArrayCola<E> clon = new ArrayCola<E>(talla);
        for(int i = 0; i < talla; i++)
        {
            E elemento = this.desencolar();
            clon.encolar(elemento);
            this.encolar(elemento);
        }
        return clon;
    }
    public ArrayCola<E> ordenarDesc()
    {
        ArrayCola<E> original = clone();
        ArrayCola<E> colaOrdenada = new ArrayCola<E>(talla);
        while (!this.esVacia()) {
            E elementoActual = desencolar();
            while (!colaOrdenada.esVacia() && ((Comparable)elementoActual).compareTo(colaOrdenada.primero()) > 0) {
                this.encolar(colaOrdenada.desencolar());
            }
            colaOrdenada.encolar(elementoActual);
        }

        while (!original.esVacia()) {
            this.encolar(original.desencolar());
        }

        return colaOrdenada;
    }
    public void imprimirOrdenadoDesc()
    {
        ArrayCola<E> aux = ordenarDesc();
        aux.toStringIterativo();
    }

    public void imprimirOrdenadoAsc()
    {
        ArrayCola<E> aux = ordenarDesc();
        aux.reverse();
        aux.toStringIterativo();
    }
}
