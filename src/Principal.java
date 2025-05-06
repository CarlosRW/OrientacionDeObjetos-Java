import carlosramirez.screenmach.modelos.Pelicula;
import carlosramirez.screenmach.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        // Orientación de objetos
        // Llama a la clase carlosramirez.screenmach.modelos.Pelicula
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

        Serie serie = new Serie();
        serie.setNombre("The Last Of Us");
        serie.setFechaDeLanzamiento(2012);
        serie.setTemporadas(2);
        serie.setMinutosPorEpisodio(59);
        serie.setEpisodiosPorTemporada(8);
        serie.muestraDatosDePelicula();
        System.out.println(serie.getDuracionEnMinutos());
    }
}
