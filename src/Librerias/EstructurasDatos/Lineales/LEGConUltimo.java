package Librerias.EstructurasDatos.Lineales;

import Librerias.EstructurasDatos.Modelos.I_ListaConUltimo;

public class LEGConUltimo<E> extends LEG<E> implements I_ListaConUltimo<E>
{
    protected NodoLEG<E> ultimo;

    public LEGConUltimo()
    {
        super();
        this.ultimo = new NodoLEG<E>(null);
    }

    public void append(E elemento)
    {
        if(head.getSiguiente() == null)
        {
            super.append(elemento);
            this.ultimo = head.getSiguiente();
            return;
        }
        else
        {
            NodoLEG<E> nuevo = new NodoLEG<E>(elemento);
            this.ultimo.setSiguiente(nuevo);
            this.ultimo = nuevo;
        }
    }

    public E getUltimo()
    {
        return this.ultimo.getElemento();
    }
}
