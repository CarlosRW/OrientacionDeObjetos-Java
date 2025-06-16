package carlosramirez.screenmatch.principal;

import carlosramirez.screenmatch.modelos.Episodio;
import carlosramirez.screenmatch.modelos.Pelicula;
import carlosramirez.screenmatch.modelos.Serie;
import carlosramirez.screenmatch.calculos.CalculadoraDeTiempo;
import carlosramirez.screenmatch.calculos.FiltroRecomendacion;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        // Orientación de objetos
        // Llama a la clase Pelicula
        Pelicula pelicula = new Pelicula("The Amazing Spider-Man", 2012);

        // Da información a las variables;
        pelicula.setDuracionEnMinutos(136);

        // Imprimir datos de la película
        pelicula.muestraDatosDePelicula();
        // Evalua la película
        pelicula.evalua(9.5);
        pelicula.evalua(10);
        pelicula.evalua(9.8);
        pelicula.setIncluidoEnElPlan(true);

        // Muestra total de evaluaciones
        System.out.println("Total de evaluaciones: " + pelicula.getTotalDeLasEvaluaciones());
        // Media de la película
        System.out.println("Media de evaluaciones de la película: " + pelicula.calculaMediaEvaluaciones());

        // Llama a la clase Serie
        Serie serie = new Serie("The Last Of Us", 2012);
        // Información de la serie
        serie.setTemporadas(2);
        serie.setMinutosPorEpisodio(59);
        serie.setEpisodiosPorTemporada(8);
        // Mostrar datos de pelicula
        serie.muestraDatosDePelicula();
        // Mostrar duración en minutos totales
        System.out.println(serie.getDuracionEnMinutos());

        // Llama a la clase Pelicula (2)
        Pelicula peliculaDos = new Pelicula("Orgullo y Prejuicio", 2005);
        // Da información a las variables
        peliculaDos.setDuracionEnMinutos(128);

        // Llama a la clase CalculadoraDeTiempo
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(pelicula);
        calculadora.incluye(serie);
        calculadora.incluye(peliculaDos);
        System.out.println("Tiempo necesario para ver tus titulos favoritos: " + calculadora.getTiempoTotal() + " minutos");

        // Llama la clase FiltroRecomendacion
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(pelicula);

        // Llama la clase Episodio
        Episodio episodio = new Episodio();
        episodio.setNumero(5);
        episodio.setNombre("Please Hold on to My Hand");
        episodio.setSerie(serie);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeCarlos = new Pelicula("El Señor de los Anillos: El Retorno del Rey", 2001);
        peliculaDeCarlos.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeCarlos);
        listaDePeliculas.add(pelicula);
        listaDePeliculas.add(peliculaDos);

        System.out.println("Tamaño de la lista de películas: " + listaDePeliculas.size());
        System.out.println("La primera película es: " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas.toString());

        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());

    }
}
