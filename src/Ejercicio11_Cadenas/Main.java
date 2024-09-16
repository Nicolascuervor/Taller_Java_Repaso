package Ejercicio11_Cadenas;

public class Main {
    public static void main(String[] args) {
                String frase = "Java es divertido";

                // Obtener la longitud de la cadena
                int longitud = frase.length();
                System.out.println("Longitud de la cadena: " + longitud);

                // Obtener un carácter en una posición específica
                char caracter = frase.charAt(5);
                System.out.println("Caracter en la posición 5: " + caracter);

                // Convertir la cadena a mayúsculas
                String mayusculas = frase.toUpperCase();
                System.out.println("En mayúsculas: " + mayusculas);

                // Verificar si la cadena contiene otra cadena
                boolean contiene = frase.contains("divertido");
                System.out.println("¿Contiene 'divertido'?: " + contiene);
            }
        }

