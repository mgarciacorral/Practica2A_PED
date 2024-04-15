package Librerias.EstructurasDatos.Modelos;

public interface I_Cola<E>
{
    public void encolar(E elemento);
    public E desencolar();
    public E primero();
    public boolean esVacia();
}
