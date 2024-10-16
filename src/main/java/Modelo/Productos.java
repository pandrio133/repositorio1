
package Modelo;




import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Productos implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_product;
    private String nombre;
    private double precio;
    private int stock;

    public Productos() {
    }

    public Productos(int id_product, String nombre, double precio, int stock) {
        this.id_product = id_product;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public Productos(String nombre, double precio, int stock) {
        this.id_product = id_product;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    
    
    public void addProducto(String nombre,double precio, int stock){
        //consulta sql para agrgar producto al carrito
        //INSERT INTO producto(nombre,precio,stock) VALUES ("fresa",5.00,10);
    }
    
    
    public void deletProducto(){}
    
    public void upProducto(){}
    
    public void buscarProducto(int id,String nombre){}

    
    public int getId_product() {
        return id_product;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    
    
}
