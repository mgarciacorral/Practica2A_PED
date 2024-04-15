package Librerias.EstructurasDatos.Lineales;

import Librerias.EstructurasDatos.Modelos.I_Cola;

public class ArrayCola<E> implements I_Cola<E>
{
    private E[] array;
    private int inicio;
    private int fin;
    private int talla;

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
            this.duplicarCapacidad();
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

    public boolean esVacia()
    {
        return this.talla == 0;
    }

    private void duplicarCapacidad()
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

    public void toString()
    {
        int index = inicio;

        for (int i = 0; i < talla; i++) {
            System.out.println(array[index] + " ");
            index = (index + 1) % array.length;
        }
    }

    public void ordenarAscendente()
    {
        ArrayCola<E> colaAux = new ArrayCola<>(array.length);
        E elemento;
        E elementoAux;
        while (!this.esVacia())
        {
            elemento = this.desencolar();
            while (!colaAux.esVacia() && ((Comparable)colaAux.primero()).compareTo(elemento) < 0)
            {
                elementoAux = colaAux.desencolar();
                this.encolar(elementoAux);
            }
            colaAux.encolar(elemento);
        }
        while (!colaAux.esVacia())
        {
            elementoAux = colaAux.desencolar();
            this.encolar(elementoAux);
        }
    }
}
