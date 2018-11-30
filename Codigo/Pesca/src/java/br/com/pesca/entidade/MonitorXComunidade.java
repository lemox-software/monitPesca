
package br.com.pesca.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**Relação entre o monitor e as comunidades onde ele atua.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "monitorXcomunidade ")
public class MonitorXComunidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /*Chave estrangeira para a atabela de monitores*/
    @ManyToOne
    @JoinColumn(name = "fk_monitor_id", referencedColumnName = "id", nullable = false)
    private MonitorCampo fk_monitor_id;
    
    /*Chave estrangeira tabela de comunidades.*/
    @ManyToOne
    @JoinColumn(name = "fk_comunidade_id", referencedColumnName = "id", nullable = false)
    private Comunidade fk_comunidade_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   

    public MonitorCampo getFk_monitor_id() {
        return fk_monitor_id;
    }

    public void setFk_monitor_id(MonitorCampo fk_monitor_id) {
        this.fk_monitor_id = fk_monitor_id;
    }

    public Comunidade getFk_comunidade_id() {
        return fk_comunidade_id;
    }

    public void setFk_comunidade_id(Comunidade fk_comunidade_id) {
        this.fk_comunidade_id = fk_comunidade_id;
    }
    
    
    
}
