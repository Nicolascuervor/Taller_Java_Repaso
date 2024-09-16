package Ejercicio1_TiposDatos_Wrapper;

public class Main2 {
    public static void main(String[] args) {
                int numeroPrimitivo = 5;
                double doblePrimitivo = 10.5;

                Integer numeroObjeto = Integer.valueOf(numeroPrimitivo);
                Double dobleObjeto = Double.valueOf(doblePrimitivo);

                System.out.println("Integer como objeto: " + numeroObjeto);
                System.out.println("Double como objeto: " + dobleObjeto);

                int numeroConvertido = numeroObjeto.intValue();
                double dobleConvertido = dobleObjeto.doubleValue();

                System.out.println("Número convertido de objeto a primitivo: " + numeroConvertido);
                System.out.println("Double convertido de objeto a primitivo: " + dobleConvertido);
            }
        }



