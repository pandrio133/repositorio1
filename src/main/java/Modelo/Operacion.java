
package Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Operacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int nro_Oprc;
    private int cliente_id;
    private String nombre_client;
    private String direc_envio;

    public Operacion() {
    }
    public Operacion(int nro_Oprc, int cliente_id, String nombre_client, String direc_envio) {
        this.nro_Oprc = nro_Oprc;
        this.cliente_id = cliente_id;
        this.nombre_client = nombre_client;
        this.direc_envio = direc_envio;
    }
    public Operacion(int cliente_id, String nombre_client, String direc_envio) {
        this.nro_Oprc = nro_Oprc;
        this.cliente_id = cliente_id;
        this.nombre_client = nombre_client;
        this.direc_envio = direc_envio;
    }

    
    
    
    public void guardarOperacion(){
        
    }

    public int getNro_Oprc() {
        return nro_Oprc;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public String getNombre_client() {
        return nombre_client;
    }

    public String getDirec_envio() {
        return direc_envio;
    }
    
    
}
