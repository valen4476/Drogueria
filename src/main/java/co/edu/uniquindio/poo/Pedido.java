package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {
private LocalDate fecha;
private int cantidad;
private Producto productoPedido;
public Producto getProductoPedido() {
    return productoPedido;
}
public void setProductoPedido(Producto productoPedido) {
    this.productoPedido = productoPedido;
}
public LocalDate getFecha() {
    return fecha;
}
public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
}
public int getCantidad() {
    return cantidad;
}
public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
}
public Pedido(LocalDate fecha, int cantidad, Producto productoPedido) {
    this.fecha = fecha;
    this.cantidad = cantidad;
    this.productoPedido=productoPedido;
}


}
