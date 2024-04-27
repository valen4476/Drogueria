package co.edu.uniquindio.poo;

import java.util.Collection;

import java.util.LinkedList;

public class Gerente {
    private Collection<Producto> listaProductos;

public Collection<Producto> getListaProductos() {
        return listaProductos;
    }


    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Gerente(double salario) {
        this.salario = salario;
    }
    public Gerente(){
        this.listaProductos=new LinkedList<>();
    }
    public void agregarProducto(Producto producto) {
        if (producto != null) {
            listaProductos.add(producto);
        }
    }

    public boolean verificarProductoExiste(Producto producto) {
        return listaProductos != null && listaProductos.contains(producto);
    }
      public void eliminarProducto(Producto producto){
        if(producto != null){
            listaProductos.remove(producto);
        }
    }
}

