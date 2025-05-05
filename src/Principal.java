public class Principal {
    public static void main(String[] args) {
        // Orientación de objetos
        // Llama a la clase Pelicula
        Pelicula pelicula = new Pelicula();
        // Da información a las variables
        pelicula.nombre = "Iron Man";
        pelicula.fechaDeLanzamiento = 2008;
        pelicula.duracionEnMinutos = 120;
        // Imprimir datos de la película 1
        System.out.println("La película: " + pelicula.nombre);
        System.out.println("Fecha de lanzamiento: " + pelicula.fechaDeLanzamiento);
        System.out.println("Duracion: " + pelicula.duracionEnMinutos);

        // Da información a las variables
        Pelicula pelicula2 = new Pelicula();
        pelicula2.nombre = "The Amazing Spider-Man";
        pelicula2.fechaDeLanzamiento = 2012;
        pelicula2.duracionEnMinutos = 136;

        System.out.println("La pelicula 2: " + pelicula2.nombre);
        System.out.println("Fecha de lanzamiento: " + pelicula2.fechaDeLanzamiento);
        System.out.println("Duracion: " + pelicula2.duracionEnMinutos);
    }
}
