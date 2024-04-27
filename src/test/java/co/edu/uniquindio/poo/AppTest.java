
package co.edu.uniquindio.poo;


import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Collection;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void stockMayor() {
        Gerente gerente = new Gerente();
    
        Producto producto1 = new Hogar("2 veces al dia", "23232", "loa", "para dolores", 3000.0, 110, "sal");
    
        gerente.agregarProducto(producto1);
    
        Collection<Producto> stockMayor = new LinkedList<>();
    
        
        if (gerente.getListaProductos() != null) {
            for (Producto producto : gerente.getListaProductos()) {
                if (producto.getStock() > 100) {
                    stockMayor.add(producto);
                }
            }
        }
    
        System.out.println("Productos con stock mayor a 100:");
        for (Producto producto2 : stockMayor) {
            System.out.println(producto2.getNombre() + ": " + producto2.getStock());
        }
    }
@Test

public void noAceptarPedidoSinStock() {
    
    Drogueria drogueria = new Drogueria("la 50", null, null, null, null);
   

    
    Pedido pedido = new Pedido(null, 0, null);
    
   
drogueria.agregarPedido(pedido);
    
  
    Collection<Pedido> listaPedidos = drogueria.getListaPedidos();
if (listaPedidos != null) {
    assertFalse(listaPedidos.contains(pedido), "El pedido debería ser rechazado");
} else
 {
}
}
}




  


   