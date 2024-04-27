package co.edu.uniquindio.poo;

public class Medicamento extends Producto {
private double dosis;
public double getDosis() {
    return dosis;
}
public void setDosis(double dosis) {
    this.dosis = dosis;
}
Medicamento(double dosis,String codigoProducto,String Nombre,String descripcion,double precio,int stock,String proveedor){
    super(codigoProducto, Nombre, descripcion, precio, stock, proveedor);
    this.dosis=dosis;
}
}
