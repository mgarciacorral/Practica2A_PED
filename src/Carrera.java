import java.time.LocalDate;

public class Carrera
{
    private int distancia;
    private String nombre;
    private String poblacion;
    private LocalDate fecha;
    private int numeroCorredores;

    public Carrera(int distancia, String nombre, String poblacion, LocalDate fecha, int numeroCorredores)
    {
        this.distancia = distancia;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.fecha = fecha;
        this.numeroCorredores = numeroCorredores;
    }

    public int getDistancia()
    {
        return distancia;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getPoblacion()
    {
        return poblacion;
    }

    public LocalDate getFecha()
    {
        return fecha;
    }

    public int getNumeroCorredores()
    {
        return numeroCorredores;
    }
}
