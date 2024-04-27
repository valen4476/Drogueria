package co.edu.uniquindio.poo;

public abstract class Empleado extends Persona{
    private double salario;
public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
public Empleado(String nombre,String apellido,String dni,String direccion,String telefono,double salario){
    super(nombre,apellido,dni,direccion,telefono);
    this.salario= salario;
}

}
    