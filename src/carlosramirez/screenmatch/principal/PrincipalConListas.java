package carlosramirez.screenmatch.principal;

import carlosramirez.screenmatch.modelos.Pelicula;
import carlosramirez.screenmatch.modelos.Serie;
import carlosramirez.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula pelicula = new Pelicula("The Amazing Spider-Man", 2012);
        pelicula.evalua(9);
        Pelicula peliculaDos = new Pelicula("Orgullo y Prejuicio", 2005);
        peliculaDos.evalua(6);
        var peliculaDeCarlos = new Pelicula("El Señor de los Anillos: El Retorno del Rey", 2001);
        peliculaDeCarlos.evalua(10);
        Serie serie = new Serie("The Last Of Us", 2012);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(pelicula);
        lista.add(peliculaDos);
        lista.add(peliculaDeCarlos);
        lista.add(serie);

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula1 && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula1.getClasificacion());
            }
        }
    }

}
