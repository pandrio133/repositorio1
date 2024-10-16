
package Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Boleta implements Serializable {
    
    @Id
    private int id;
    private double saldo;

    
    public Boleta() {
    }

    public Boleta(int id_pddo, double saldo_total) {
        this.id= id_pddo;
        this.saldo= saldo_total;
    }
    
    
    
    public void verBoleta(){
        
    }
    
    public void guardarBoleta(){
        
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    
}
