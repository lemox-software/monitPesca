
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

/**Registro dos dias ativos de cada embarcação em um período de 1 mês.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "diasAtivos")
public class DiasAtivos implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /*Chave estrangeira tabela de embarcação.*/
    @ManyToOne
    @JoinColumn(name = "fk_embarcacao_id", referencedColumnName = "id", nullable = false)
    private Embarcacao fk_embarcacao_id;
    
    /*Localidade*/
    @Column(nullable = true, length = 30)
    private String localidade;
    
    /*Chave estrangeira tabela de comunidades.*/
    @ManyToOne
    @JoinColumn(name = "fk_comunidade_id", referencedColumnName = "id", nullable = false)
    private Comunidade 	fk_comunidade_id;
    
    /*Data em que o evento ocorreu.*/
    @Column(nullable = false)
    private Date dataAtividade;
    
    /*Esse valor deverá ser preenchido com 0(zero) se a embarcação não estiver pescando ou 1 se ela estiver.*/
    @Column(nullable = false, length = 1)
    private String statusAtividade;
    
    /*Campo livre preenchimento com dados observacionais.*/
    @Column(nullable = true, length = 255)
    private String observacoes;
    
    /*Chave estrangeira para tabela de status dos registros.*/
    @ManyToOne
    @JoinColumn(name = "fk_statusRegistro_id", referencedColumnName = "id", nullable = false)
    private StatusRegistro fk_statusRegistro_id;

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

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public Comunidade getFk_comunidade_id() {
        return fk_comunidade_id;
    }

    public void setFk_comunidade_id(Comunidade fk_comunidade_id) {
        this.fk_comunidade_id = fk_comunidade_id;
    }

    public Date getDataAtividade() {
        return dataAtividade;
    }

    public void setDataAtividade(Date dataAtividade) {
        this.dataAtividade = dataAtividade;
    }

    public String getStatusAtividade() {
        return statusAtividade;
    }

    public void setStatusAtividade(String statusAtividade) {
        this.statusAtividade = statusAtividade;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public StatusRegistro getFk_statusRegistro_id() {
        return fk_statusRegistro_id;
    }

    public void setFk_statusRegistro_id(StatusRegistro fk_statusRegistro_id) {
        this.fk_statusRegistro_id = fk_statusRegistro_id;
    }
    
    
    
    
}
