package Librerias.EstructurasDatos.Modelos;

public interface I_Pila<E>
{
    public void apilar(E elemento);
    public E desapilar();
    public E tope();
    public boolean esVacia();
}
