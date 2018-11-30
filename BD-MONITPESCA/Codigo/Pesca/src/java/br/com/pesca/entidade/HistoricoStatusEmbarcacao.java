
package br.com.pesca.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**Registro do histórico de embarcações que foram desativadas, estão em estaleiros, ou outra razão que as impeça de pescar.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "historicoStatusEmbarcacao")
public class HistoricoStatusEmbarcacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /*Chave estrangeira para a tabela de embarcações.*/
    @ManyToOne
    @JoinColumn(name = "fk_embarcacao_id", referencedColumnName = "id", nullable = false)
    private Embarcacao fk_embarcacao_id;
    
    /*Data da alteração do status da embarcação, que pode ser inativa ou ativa.*/
    @Column(nullable = false)
    private Date dataAlteracaoStatus;
    
    /*Descrição do status da embarcação.*/
    @Column(nullable = false,length = 30)
    private String descricaoStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public Embarcacao getFk_embarcacao_id() {
        return fk_embarcacao_id;
    }

    public void setFk_embarcacao_id(Embarcacao fk_embarcacao_id) {
        this.fk_embarcacao_id = fk_embarcacao_id;
    }

    public Date getDataAlteracaoStatus() {
        return dataAlteracaoStatus;
    }

    public void setDataAlteracaoStatus(Date dataAlteracaoStatus) {
        this.dataAlteracaoStatus = dataAlteracaoStatus;
    }

    public String getDescricaoStatus() {
        return descricaoStatus;
    }

    public void setDescricaoStatus(String descricaoStatus) {
        this.descricaoStatus = descricaoStatus;
    }
    
    
}
