package Ejercicio7_Herencia_Polimorfismo;

public class Hija extends Persona{

    public Hija(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Hija(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Hija() {
    }

    public Hija(String nombre, String apellido, int edad, int id) {
        super(nombre, apellido, edad, id);
    }


}
