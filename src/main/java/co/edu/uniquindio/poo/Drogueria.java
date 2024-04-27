package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Drogueria {
  private String nombre;
  private Collection<Cliente>listaClientes;
  private Collection<Producto>listaProductos;
  private Collection<Pedido>listaPedidos;
  private Collection<Empleado>listaEmpleados;

public Drogueria(String nombre,Collection<Cliente>listaClientes,Collection<Producto>listaProductos,Collection<Pedido>listaPedidos,Collection<Empleado>listEmpleados){
    this.nombre=nombre;
    listaClientes =new LinkedList<>();
    listEmpleados= new LinkedList<>();
    listaPedidos=new LinkedList<>();
    listaProductos=new LinkedList<>();

}
  public void setListaProductos(Collection<Producto> listaProductos) {
    this.listaProductos = listaProductos;
}

public Collection<Cliente>getListaClientes(){
    return listaClientes;
}

public Collection<Producto>getListaProductos(){
    return listaProductos;
}
public Collection<Pedido>getListaPedidos(){
    return listaPedidos;
}
public Collection<Empleado>getListaEmpleados(){
    return listaEmpleados;
}
public String getNombre(){
    return nombre;
}
public void agregarPedido(Pedido pedido) {
    if (pedido == null) {
        listaPedidos.add(pedido);
    }
}

public boolean verificarPedidoExiste(Pedido pedido) {
    return listaPedidos == null && listaPedidos.contains(pedido);
}

public double calcularCostoTotal(List<Pedido> listaPedidos) {
        double costoTotal = 0.0;
        for (Pedido pedido : listaPedidos) {
            costoTotal += Producto.getPrecio() * pedido.getCantidad();
        }
        return costoTotal;
    }


}
