
package br.com.pesca.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**Registro dos diversos tipos de conservação do pescado.
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "conservacaoPescado")
public class ConservacaoPescado implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /*Tipo de conservação do pescado. Ex gelo, sal, etc.*/
    @Column(nullable = false, length = 30)
    private String tipoConservacao;
    
    /*Breve descrição do tipo de conservação do pescado.*/
    @Column(nullable = true, length = 255)
    private String descricaoTipoConservacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

 

    public String getTipoConservacao() {
        return tipoConservacao;
    }

    public void setTipoConservacao(String tipoConservacao) {
        this.tipoConservacao = tipoConservacao;
    }

    public String getDescricaoTipoConservacao() {
        return descricaoTipoConservacao;
    }

    public void setDescricaoTipoConservacao(String descricaoTipoConservacao) {
        this.descricaoTipoConservacao = descricaoTipoConservacao;
    }
    
    
    
}
