package carlosramirez.screenmatch.modelos;

import carlosramirez.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {

    // Variables
    private String director;

    // Constructor
    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    // Getteres & Setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMediaEvaluaciones() / 2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + "(" + getFechaDeLanzamiento() + ")";
    }
}
