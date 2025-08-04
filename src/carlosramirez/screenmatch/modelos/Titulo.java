package carlosramirez.screenmatch.modelos;

import carlosramirez.screenmatch.excepcion.ErrorEnConversionDeDuracionException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

    // Variables
    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
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

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if(miTituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionException("No pude convertir la duración porque contiene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(
                miTituloOmdb.runtime().substring(0, 3).replace(" ", ""));
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

    @Override
    public String toString() {
        return "Nombre: " + nombre + '\'' +
                ", fechaDeLanzamiento: " + fechaDeLanzamiento + '\'' +
                ", duracion: " + duracionEnMinutos;
    }
}
