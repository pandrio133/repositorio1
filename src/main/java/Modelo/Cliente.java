
package Modelo;


import com.mycompany.carrito.Controlador.ClienteJpaController;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Cliente implements Serializable {
    
    @Id
    private int dni;
    @Basic
    private String nombre;
    private String correo;
    private int tel;
    private int tarjeta;
    
    private ClienteJpaController CJPA=new ClienteJpaController();

    public Cliente() {
    }
    
    public Cliente(int dni, String correo, String nombre, int tel, int tarjeta) {
        this.dni = dni;
        this.correo = correo;
        this.nombre = nombre;
        this.tel = tel;
        this.tarjeta = tarjeta;
        

    }
    public Cliente(int dni, String correo, String nombre, int tel) {
        this.dni = dni;
        this.correo = correo;
        this.nombre = nombre;
        this.tel = tel;
        this.tarjeta = tarjeta;
           
    }

    
    
    
    public void pedir(){
        
    }
    
    public void cancelarPedido(){
        
    }
    public void pagar(){
        
    }
    public void verStdPedido(){
        
    }
    public void guadarDatos(Cliente nv){       
        try {
            CJPA.create(nv);
        } catch (Exception ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void guardarTarjeta(int tarjeta){
        
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getDni() {
        return dni;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTel() {
        return tel;
    }

    public int getTarjeta() {
        return tarjeta;
    }
    
    
    
    
}
