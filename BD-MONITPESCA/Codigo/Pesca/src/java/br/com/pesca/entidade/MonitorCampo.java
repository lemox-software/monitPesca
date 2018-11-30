
package br.com.pesca.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**Dados de cadastro dos monitores de campo que realizam as amostragens
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "monitorCampo ")
public class MonitorCampo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /*Primeiro nome do monitor.*/
    @Column(nullable = false, length = 30)
    private String nomeMonitor;
    
    /*Sobrenome completo do monitor.*/
    @Column(nullable = false, length = 60)
    private String sobrenomeMonitor;
    
    /*Identidade do monitor.*/
    @Column(nullable = false, length = 9)
    private String rgMonitor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public String getNomeMonitor() {
        return nomeMonitor;
    }

    public void setNomeMonitor(String nomeMonitor) {
        this.nomeMonitor = nomeMonitor;
    }

    public String getSobrenomeMonitor() {
        return sobrenomeMonitor;
    }

    public void setSobrenomeMonitor(String sobrenomeMonitor) {
        this.sobrenomeMonitor = sobrenomeMonitor;
    }

    public String getRgMonitor() {
        return rgMonitor;
    }

    public void setRgMonitor(String rgMonitor) {
        this.rgMonitor = rgMonitor;
    }
    
    
        
}
