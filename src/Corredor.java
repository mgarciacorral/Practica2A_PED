public class Corredor
{
    int dorsal;
    String nombre;
    int puestp;
    int tiempoH;
    int tiempoM;
    int tiempoS;

    public Corredor(int dorsal, String nombre, int tiempoH, int tiempoM, int tiempoS)
    {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.tiempoH = tiempoH;
        this.tiempoM = tiempoM;
        this.tiempoS = tiempoS;
    }

    public int getDorsal()
    {
        return dorsal;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getPuesto()
    {
        return puestp;
    }

    public void setPuesto(int puesto)
    {
        this.puestp = puesto;
    }

    public int getTiempoH()
    {
        return tiempoH;
    }

    public int getTiempoM()
    {
        return tiempoM;
    }

    public int getTiempoS()
    {
        return tiempoS;
    }

    public String toString()
    {
        return dorsal + "\t" + nombre + "\t" + tiempoH + ":" + tiempoM + ":" + tiempoS;
    }



}
