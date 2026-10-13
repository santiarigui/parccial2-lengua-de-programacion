
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Datos del estudiante
        System.out.println("=== REGISTRO DE ESTUDIANTE ===");

        System.out.print("Ingrese el nombre: ");
        String nombreEstudiante = entrada.nextLine();

        System.out.print("Ingrese la edad: ");
        int edadEstudiante = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingrese el documento: ");
        String documentoEstudiante = entrada.nextLine();

        System.out.print("Ingrese el programa academico: ");
        String programa = entrada.nextLine();

        System.out.print("Ingrese el promedio: ");
        double promedio = entrada.nextDouble();
        entrada.nextLine();

        Estudiante estudiante = new Estudiante(
            nombreEstudiante,
            edadEstudiante,
            documentoEstudiante,
            programa,
            promedio
        );

        // Datos del profesor
        System.out.println("\n=== REGISTRO DE PROFESOR ===");

        System.out.print("Ingrese el nombre: ");
        String nombreProfesor = entrada.nextLine();

        System.out.print("Ingrese la edad: ");
        int edadProfesor = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingrese el documento: ");
        String documentoProfesor = entrada.nextLine();

        System.out.print("Ingrese el area: ");
        String area = entrada.nextLine();

        System.out.print("Ingrese el salario base: ");
        double salarioBase = entrada.nextDouble();

        System.out.print("Ingrese las horas de catedra: ");
        int horasCatedra = entrada.nextInt();

        Profesor profesor = new Profesor(
            nombreProfesor,
            edadProfesor,
            documentoProfesor,
            area,
            salarioBase,
            horasCatedra
        );

        // Mostrar informacion
        System.out.println("\n=== INFORMACION DEL ESTUDIANTE ===");
        estudiante.mostrarInfo();
        System.out.println("Rol: " + estudiante.getRol());

        System.out.println("\n=== INFORMACION DEL PROFESOR ===");
        profesor.mostrarInfo();
        System.out.println("Rol: " + profesor.getRol());
        System.out.println("Salario calculado: "
                           + profesor.calcularSalario());

        entrada.close();
    }
}
