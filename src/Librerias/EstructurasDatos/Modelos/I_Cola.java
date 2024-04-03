package Librerias.EstructurasDatos.Modelos;

public interface I_Cola
{
    public void encolar(Object elemento);
    public Object desencolar();
    public Object primero();
    public boolean esVacia();
}
