
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

/**Registro do histórico de movimentação da embarcação entre localidades ou portos de registro. 
 *Se a embarcação mudar de porto principal ou localidade o registro será armazenado nessa entidade.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "historicoMudancaEmbarcacao")
public class HistoricoMudancaEmbarcacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /*Chave estrangeira para a tabela de embarcações.*/
    @ManyToOne
    @JoinColumn(name = "fk_embarcacao_id", referencedColumnName = "id", nullable = false)
    private Embarcacao fk_embarcacao_id;
    
    /*Data da mudança da embarcação para outro porto ou comunidade.*/
    @Column(nullable = false)
    private Date dataMudanca;
    
    /*Id do porto no qual a embarcação estava registrada.*/
    @ManyToOne
    @JoinColumn(name = "idPortoAnterior", referencedColumnName = "id", nullable = false)
    private Porto idPortoAnterior;
    
    /*Id da comunidade anterior a qual pertencia a embarcação.*/
    @ManyToOne
    @JoinColumn(name = "idComunidadeAnterior", referencedColumnName = "id", nullable = false)
    private Comunidade idComunidadeAnterior;
    
    /*Descrição breve do motivo da mudança da embarcação.*/
    @Column(nullable = false,length = 255)
    private String motivoMudanca;

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

    public Date getDataMudanca() {
        return dataMudanca;
    }

    public void setDataMudanca(Date dataMudanca) {
        this.dataMudanca = dataMudanca;
    }

    public Porto getIdPortoAnterior() {
        return idPortoAnterior;
    }

    public void setIdPortoAnterior(Porto idPortoAnterior) {
        this.idPortoAnterior = idPortoAnterior;
    }

    public Comunidade getIdComunidadeAnterior() {
        return idComunidadeAnterior;
    }

    public void setIdComunidadeAnterior(Comunidade idComunidadeAnterior) {
        this.idComunidadeAnterior = idComunidadeAnterior;
    }

    public String getMotivoMudanca() {
        return motivoMudanca;
    }

    public void setMotivoMudanca(String motivoMudanca) {
        this.motivoMudanca = motivoMudanca;
    }
    
    
    
    
}
