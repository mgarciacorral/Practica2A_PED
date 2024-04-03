package Librerias.EstructurasDatos.Modelos;

public interface I_ListaConUltimoEC<E>
{
    public void append(E elemento);
    public E get(int index);
    public void remove(int index);
    public void add(E elemento);
    public E getUltimo() throws InterruptedException;
    public void toStringIterativo();
}
