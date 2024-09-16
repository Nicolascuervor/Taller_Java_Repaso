package Ejercicio6_Constructores_Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("nicolas","Cuervo",12,21);
        Persona persona2 = new Persona("nicolas","Cuervo");
        Persona persona3 = new Persona();
        Persona persona4 = new Persona("nicolas","Cuervo",12);
    }
}
