package Ejercicio3_Estructuras_Control;

public class For2 {
    public int factorial;

    public int ciclo(){
        int total = 1;
        for (int i = 1; i <= factorial; i++){
            total *= i;
        }

        return total;
    }
}
