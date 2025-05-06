import carlosramirez.screenmach.modelos.Episodio;
import carlosramirez.screenmach.modelos.Pelicula;
import carlosramirez.screenmach.modelos.Serie;
import carlosramirez.screenmatch.calculos.CalculadoraDeTiempo;
import carlosramirez.screenmatch.calculos.FiltroRecomendacion;

public class Principal {
    public static void main(String[] args) {
        // Orientación de objetos
        // Llama a la clase Pelicula
        Pelicula pelicula = new Pelicula();

        // Da información a las variables
        pelicula.setNombre("The Amazing Spider-Man");
        pelicula.setFechaDeLanzamiento(2012);
        pelicula.setDuracionEnMinutos(136);

        // Imprimir datos de la película
        pelicula.muestraDatosDePelicula();
        // Evalua la película
        pelicula.evaluarPelicula(9.5);
        pelicula.evaluarPelicula(10);
        pelicula.evaluarPelicula(9.8);
        pelicula.setIncluidoEnElPlan(true);

        // Muestra total de evaluaciones
        System.out.println("Total de evaluaciones: " + pelicula.getTotalDeLasEvaluaciones());
        // Media de la película
        System.out.println("Media de evaluaciones de la película: " + pelicula.calculaMediaEvaluaciones());

        // Llama a la clase Serie
        Serie serie = new Serie();
        // Información de la serie
        serie.setNombre("The Last Of Us");
        serie.setFechaDeLanzamiento(2012);
        serie.setTemporadas(2);
        serie.setMinutosPorEpisodio(59);
        serie.setEpisodiosPorTemporada(8);
        // Mostrar datos de pelicula
        serie.muestraDatosDePelicula();
        // Mostrar duración en minutos totales
        System.out.println(serie.getDuracionEnMinutos());

        // Llama a la clase Pelicula (2)
        Pelicula peliculaDos = new Pelicula();
        // Da información a las variables
        peliculaDos.setNombre("Orgullo y Prejuicio");
        peliculaDos.setFechaDeLanzamiento(2005);
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
    }
}
