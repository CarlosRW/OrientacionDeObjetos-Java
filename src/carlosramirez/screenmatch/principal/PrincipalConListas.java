package carlosramirez.screenmatch.principal;

import carlosramirez.screenmatch.modelos.Pelicula;
import carlosramirez.screenmatch.modelos.Serie;
import carlosramirez.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("The Amazing Spider-Man");
        listaDeArtistas.add("Orgullo y Prejuicio");
        listaDeArtistas.add("El Rey");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada"+ listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados"+ lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha "+ lista);
    }

}
