
package Modelo;

import java.io.Serializable;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_pddo;
    private int nro_Oprc;
    private Time fech_pddo;
    private String direc_envio;
    private int id_detalles_pddo;
    private Time fech_entrega;
    private String estado;

    public Pedido() {
    }

    public Pedido(int id_pddo, int nro_Oprc, Time fech_pddo, String direc_envio, int id_detalles_pddo, Time fech_entrega, String estado) {
        this.id_pddo = id_pddo;
        this.nro_Oprc = nro_Oprc;
        this.fech_pddo = fech_pddo;
        this.direc_envio = direc_envio;
        this.id_detalles_pddo = id_detalles_pddo;
        this.fech_entrega = fech_entrega;
        this.estado = estado;
    }
    
    
    
    public void upEstado(){
        
    }
    public  void tiempoEntrega(){
        
    }
    
    public void modificarTiempoEntrega(){
        
    }

    public int getId_pddo() {
        return id_pddo;
    }

    public int getNro_Oprc() {
        return nro_Oprc;
    }

    public Time getFech_pddo() {
        return fech_pddo;
    }

    public String getDirec_envio() {
        return direc_envio;
    }

    public int getId_detalles_pddo() {
        return id_detalles_pddo;
    }

    public Time getFech_entrega() {
        return fech_entrega;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
