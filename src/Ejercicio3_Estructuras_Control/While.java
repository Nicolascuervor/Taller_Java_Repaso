package Ejercicio3_Estructuras_Control;

public class While {
    public int imprimir_hasta;

    public void ciclo(){
        int suma = 0;
        while (suma <= imprimir_hasta){
            System.out.println(suma);
            suma ++;
        }
    }
}
