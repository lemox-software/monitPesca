
package br.com.pesca.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**Status dos registros do sistema, compreendendo a lógica da cama do negócio que determina diversos estágio de vida do registro.
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "statusRegistro")
public class StatusRegistro implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /*Definição do status do registro: 1 = pendente validação; 2 = pendente auditoria; 3 = pendente correção; 4 = auditado*/
    @Column(nullable = false)
    private Integer statusRegistro;
    
    /*Descrição dos status dos registros.*/
    @Column(nullable = false, length = 20)
    private String descricaoStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public Integer getStatusRegistro() {
        return statusRegistro;
    }

    public void setStatusRegistro(Integer statusRegistro) {
        this.statusRegistro = statusRegistro;
    }

    public String getDescricaoStatus() {
        return descricaoStatus;
    }

    public void setDescricaoStatus(String descricaoStatus) {
        this.descricaoStatus = descricaoStatus;
    }
    
    
    
}
