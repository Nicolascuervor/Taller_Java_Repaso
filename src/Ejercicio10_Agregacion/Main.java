package Ejercicio10_Agregacion;

public class Main {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Ana", 50000);
        Empleado emp2 = new Empleado("Carlos", 60000);


        Departamento depto = new Departamento("Recursos Humanos");

        depto.agregarEmpleado(emp1);
        depto.agregarEmpleado(emp2);


        depto.mostrarEmpleados();
    }
}