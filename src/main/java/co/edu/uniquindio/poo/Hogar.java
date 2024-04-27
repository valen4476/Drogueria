package co.edu.uniquindio.poo;




public class Hogar extends Producto {
private String indicaciones;
public String getIndicaciones() {
    return indicaciones;
}
public void setIndicaciones(String indicaciones) {
    this.indicaciones = indicaciones;
}
public Hogar(String indicaciones,String codigoProducto,String nombre,String descripcion,double precio,int stock,String proveedor){
    super(codigoProducto, nombre, descripcion, precio, stock, proveedor); 
    this.indicaciones=indicaciones;
}

}
