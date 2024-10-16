
package Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Detalles_Pedido implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_DP;
    private String producto;
    private int cantidad;

    public Detalles_Pedido() {
    }

    public Detalles_Pedido(int id_DP, String producto, int cantidad) {
        this.id_DP = id_DP;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    
    
    public void buscarProducto(){}
    public void verificarStock(){}
    public void addColumnProduct(){}
    public void deletColumProduct(){}
    public void calculoMontoProducto(){}
    public void calculoMontoTotal(){}    
    public void listaProductos(){}

    public int getId_DP() {
        return id_DP;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
}
