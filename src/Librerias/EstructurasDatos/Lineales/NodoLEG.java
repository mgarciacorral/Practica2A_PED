package Librerias.EstructurasDatos.Lineales;

public class NodoLEG<E>
{
    private NodoLEG<E> siguiente;
    private E elemento;

    public NodoLEG(E elemento)
    {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public E getElemento()
    {
        return elemento;
    }

    public void setElemento(E elemento)
    {
        this.elemento = elemento;
    }

    public NodoLEG<E> getSiguiente()
    {
        return siguiente;
    }

    public void setSiguiente(NodoLEG<E> siguiente)
    {
        this.siguiente = siguiente;
    }

    public void toStringRecursivo()
    {
        if(this.elemento != null)
        {
            System.out.print(this.elemento + " ");
        }
        if (this.siguiente != null)
        {
            this.siguiente.toStringRecursivo();
        }
    }

    public String toStringInversoRecursivo(String in)
    {
        String res = "";
        if(this.elemento != null)
        {
            res = this.elemento + " " + in;
        }
        if (this.siguiente != null)
        {
            res = this.siguiente.toStringInversoRecursivo(res);
        }

        return res;
    }

    public NodoLEG<E> insertarCentinelas()
    {
        if(this.siguiente == null)
        {
            if((int)this.elemento%2 == 0 && (int)this.elemento != -12)
            {
                this.siguiente = new NodoLEG<E>((E) new Integer(-12));
                return this.siguiente;
            }
            else
            {
                return null;
            }
        }
        else
        {
            NodoLEG<E> aux = this.siguiente.insertarCentinelas();
            if(aux != null)
            {
                if((int)this.elemento%2 == 0 && (int)this.elemento != -12 && (int)this.siguiente.getElemento() != -12)
                {
                    NodoLEG<E> nuevo = new NodoLEG<E>((E) new Integer(-12));
                    nuevo.setSiguiente(this.siguiente);
                    this.setSiguiente(nuevo);
                }
            }
            return aux;
        }
    }
}
