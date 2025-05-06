import carlosramirez.screenmach.modelos.Pelicula;

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







//        // Da información a las variables
//        carlosramirez.screenmach.modelos.Pelicula pelicula2 = new carlosramirez.screenmach.modelos.Pelicula();
//        pelicula2.nombre = "The Amazing Spider-Man";
//        pelicula2.fechaDeLanzamiento = 2012;
//        pelicula2.duracionEnMinutos = 136;

//        // Imprimir datos de la película
//        pelicula2.muestraDatosDePelicula();
//        // Evaluaciones
//        pelicula2.evaluarPelicula(10);
//        pelicula2.evaluarPelicula(10);
//
//        // Media de la película
//        System.out.println("Media de evaluaciones de la película: " + pelicula.calculaMediaEvaluaciones());
    }
}
