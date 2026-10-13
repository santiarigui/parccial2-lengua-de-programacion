
public class Persona {

    protected String nombre;
    protected int edad;
    protected String documento;

    // Constructor
    public Persona(String nombre, int edad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    // Mostrar informacion general
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Documento: " + documento);
    }

    // Obtener el rol
    public String getRol() {
        return "Persona";
    }
}
