package Ejercicio5_Modificador_Final;

public class Metodo {
    public final void mensaje(){
        System.out.println("Este mensaje no podra ser sobre escrito");
    }
}

class hija extends Metodo{
    //Si intentamos sobreescribir el metodo en su clase hija nos mandara un error debido a que el metodo esta declarado como FINAL
}
