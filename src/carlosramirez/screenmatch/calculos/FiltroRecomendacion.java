package carlosramirez.screenmatch.calculos;

public class FiltroRecomendacion {
    //Métodos
    public void filtra(Clasificable clasificable){
        if (clasificable.getClasificacion() >= 4){
            System.out.println("Buena clasificación");
        } else if (clasificable.getClasificacion() >= 2) {
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Guárdalo en tu lista para verlo más tarde");
        }
    }
}
