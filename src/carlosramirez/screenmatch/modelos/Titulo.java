package carlosramirez.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{

    // Variables
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan = true;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    // Constructor
    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.nombre = nombre;
    }

    // Método para mostrar los datos de las películas
    public void muestraDatosDePelicula() {
        System.out.println("Nombre de la película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion: " + getDuracionEnMinutos() + " minutos");
    }

    // Método para evaluar las películas
    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    // Método para calcular la media
    public double calculaMediaEvaluaciones() {
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo ) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }
}
