package co.edu.uniquindio.poo;


import java.util.Collection;

import java.util.LinkedList;

public abstract class Producto {
    private String codigoProducto;
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    private String nombre;
    private String descripcion;
    private static double precio;
    private int stock;
    private String proveedor;
    private Collection<Producto> listaProductos = new LinkedList<>();
    public Producto(){
        this.listaProductos= new LinkedList<>();
    }
    public Collection<Producto> getListaProductos() {
        return listaProductos;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public static double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        Producto.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getProveedor() {
        return proveedor;
    }
    public Producto(String codigoProducto, String nombre, String descripcion, double precio, int stock,
            String proveedor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        Producto.precio = precio;
        this.stock = stock;
        this.proveedor = proveedor;
        assert stock >0;
        
    }
   
}
