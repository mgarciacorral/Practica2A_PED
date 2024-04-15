package Librerias.EstructurasDatos.Modelos;

public interface I_ListaConUltimo<E>
{
    public void append(E elemento);
    public E get(int index);
    public void remove(int index);
    public void add(E elemento);
    public E getUltimo();
    public void toStringIterativo();
}
