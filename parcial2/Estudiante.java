
public class Estudiante extends Persona {

    private String programa;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, int edad, String documento,
                      String programa, double promedio) {

        super(nombre, edad, documento);

        this.programa = programa;
        this.promedio = promedio;
    }

    // Mostrar informacion del estudiante
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Programa: " + programa);
        System.out.println("Promedio: " + promedio);
    }

    // Obtener el rol
    @Override
    public String getRol() {
        return "Estudiante";
    }
}
