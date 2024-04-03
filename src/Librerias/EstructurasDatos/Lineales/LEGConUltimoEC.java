package Librerias.EstructurasDatos.Lineales;

import Librerias.EstructurasDatos.Modelos.I_ListaConUltimoEC;
import Librerias.ExcepcionesDeUsuario.FalloEnOperacion;

public class LEGConUltimoEC<E extends Number> extends LEGConUltimo<E> implements I_ListaConUltimoEC<E>
{
    public LEGConUltimoEC()
    {
        super();
    }

    public void moverCabeza() throws FalloEnOperacion
    {
        try
        {
            if (head.getSiguiente() == null || (int)head.getSiguiente().getElemento() < (int)ultimo.getElemento())
            {
                throw new FalloEnOperacion("Imposible realizar esa operacion.");
            }
        }catch(Exception e)
        {
            System.out.println("Imposible realizar esa operacion.");
            return;
        }

        E aux = this.head.getSiguiente().getElemento();
        this.remove(0);
        this.append(aux);
    }

    public void borrarMinimo()
    {
        if (head.getSiguiente() == null)
        {
            return;
        }
        NodoLEG<E> actual = this.head.getSiguiente();
        NodoLEG<E> anterior = this.head;
        NodoLEG<E> minimo = actual;
        NodoLEG<E> anteriorMinimo = anterior;
        while (actual != null)
        {
            if ((int)actual.getElemento() < (int)minimo.getElemento())
            {
                minimo = actual;
                anteriorMinimo = anterior;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }

        if (minimo != null && minimo.getSiguiente() != null) {
            anteriorMinimo.setSiguiente(minimo.getSiguiente());
        }
        else
        {
            anteriorMinimo.setSiguiente(null);
        }
    }

    public void insertarCentinelasConUltimo()
    {
        if (head.getSiguiente() == null)
        {
            return;
        }
        if((int)ultimo.getElemento()%2 == 0)
        {
            NodoLEG<E> actual = this.head.getSiguiente();

            while(actual.getSiguiente() != null)
            {
                if((int)actual.getElemento()%2 == 0 && (int)actual.getElemento() != -12 && (int)actual.getSiguiente().getElemento() != -12)
                {
                    NodoLEG<E> aux = actual.getSiguiente();
                    actual.setSiguiente(new NodoLEG<E>((E) new Integer(-12)));
                    actual.getSiguiente().setSiguiente(aux);
                    actual = actual.getSiguiente().getSiguiente();
                }
                else
                {
                    actual = actual.getSiguiente();
                }

            }
            if((int)actual.getElemento()%2 == 0 && (int)actual.getElemento() != -12)
            {
                append((E) new Integer(-12));
            }

        }
    }

    public void insertarCentinelasSinUltimo()
    {
        if (head.getSiguiente() == null)
        {
            return;
        }

        NodoLEG<E> aux = head.getSiguiente().insertarCentinelas();
        if(aux != null)
        {
            this.ultimo = aux;
        }

    }
}
