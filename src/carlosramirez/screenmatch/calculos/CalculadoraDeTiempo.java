package carlosramirez.screenmatch.calculos;

import carlosramirez.screenmach.modelos.Pelicula;
import carlosramirez.screenmach.modelos.Serie;
import carlosramirez.screenmach.modelos.Titulo;

public class CalculadoraDeTiempo {
    // Variables
    private int tiempoTotal;

    // Getters
    public int getTiempoTotal() {
        return tiempoTotal;
    }

    // Método de calcular el tiempo total de Pelicula y Serie
    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
