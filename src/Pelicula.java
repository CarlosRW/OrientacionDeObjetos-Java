public class Pelicula {
    // Variables
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan = true;
    double sumaDeLasEvaluaciones;
    int totalDeLasEvaluaciones;

    // Método para mostrar los datos de las películas
    void muestraDatosDePelicula() {
        System.out.println("Nombre de la película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion: " + duracionEnMinutos);
    }

    // Método para evaluar las películas
    void evaluarPelicula(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones ++;
    }

    // Método para calcular la media
    double calculaMediaEvaluaciones() {
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
