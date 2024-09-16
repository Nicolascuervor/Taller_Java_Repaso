package Ejercicio3_Estructuras_Control;

public class For {
    public int sumar_Hasta;

    public int ciclo(){
        int total = 0;
        for (int i = 1; i <= sumar_Hasta; i++){
            total += i;
        }

        return total;
    }
}
