public class Principal {
    public static void main(String[] args) {
        // Orientación de objetos
        // Llama a la clase Pelicula
        Pelicula pelicula = new Pelicula();

        // Da información a las variables
        pelicula.nombre = "Iron Man";
        pelicula.fechaDeLanzamiento = 2008;
        pelicula.duracionEnMinutos = 120;

        // Imprimir datos de la película
        pelicula.muestraDatosDePelicula();
        // Evalua la película
        pelicula.evaluarPelicula(8.5);
        pelicula.evaluarPelicula(10);

        // Media de la película
        System.out.println("Media de evaluaciones de la película: " + pelicula.calculaMediaEvaluaciones());

        // Da información a las variables
        Pelicula pelicula2 = new Pelicula();
        pelicula2.nombre = "The Amazing Spider-Man";
        pelicula2.fechaDeLanzamiento = 2012;
        pelicula2.duracionEnMinutos = 136;

        // Imprimir datos de la película
        pelicula2.muestraDatosDePelicula();
        pelicula2.evaluarPelicula(10);
        pelicula2.evaluarPelicula(10);

        // Media de la película
        System.out.println("Media de evaluaciones de la película: " + pelicula.calculaMediaEvaluaciones());
    }
}
