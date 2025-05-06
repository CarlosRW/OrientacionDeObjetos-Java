package carlosramirez.screenmach.modelos;

import carlosramirez.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {
    // Variables
    private String director;

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
}
