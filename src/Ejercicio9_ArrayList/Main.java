package Ejercicio9_ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        Persona persona1 = new Persona("Nicolas","Cuervo",18,123423);
        Persona persona2 = new Persona("Jose","Gomez",10,123423);
        Persona persona3 = new Persona("Santiago","Rios",12,123423);
        Persona persona4 = new Persona("Pedro","Alzate",40,123423);

        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);

        System.out.println(listaPersonas);
    }
}
