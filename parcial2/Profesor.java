
public class Profesor extends Persona {

    private String area;
    private double salarioBase;
    private int horasCatedra;

    // Constructor
    public Profesor(String nombre, int edad, String documento,
                    String area, double salarioBase, int horasCatedra) {

        super(nombre, edad, documento);

        this.area = area;
        this.salarioBase = salarioBase;
        this.horasCatedra = horasCatedra;
    }

    // Mostrar informacion del profesor
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Area: " + area);
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Horas de catedra: " + horasCatedra);
    }

    // Calcular salario
    public double calcularSalario() {
        return salarioBase;
    }

    // Obtener el rol
    @Override
    public String getRol() {
        return "Profesor";
    }
}
