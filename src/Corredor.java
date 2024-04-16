public class Corredor implements Comparable<Corredor>
{
    private int dorsal;
    private String nombre;
    private int puesto;
    private int tiempoH;
    private int tiempoM;
    private int tiempoS;

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
        return puesto;
    }

    public void setPuesto(int puesto)
    {
        this.puesto = puesto;
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
        return dorsal + "\t\t" + nombre + "\t\t\t" + tiempoH + ":" + tiempoM + ":" + tiempoS;
    }

    public void mostrarDatos()
    {
        System.out.println(dorsal + "\t\t" + nombre + "\t\t\t" + tiempoH + ":" + tiempoM + ":" + tiempoS);
    }

    public int compareTo(Corredor corredor) {
        int tiempoTh = this.tiempoH * 3600 + this.tiempoM * 60 + this.tiempoS;
        int tiempoTc = corredor.tiempoH * 3600 + corredor.tiempoM * 60 + corredor.tiempoS;

        if(tiempoTh < tiempoTc)
        {
            return -1;
        }
        else if(tiempoTh > tiempoTc)
        {
            return 1;
        }
        else{
            return 0;
        }
}}

