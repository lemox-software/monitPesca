
package br.com.pesca.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**Cadastros das comunidades de atuação do programa.
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "equiposEmbarcacao")
public class EquiposEmbarcacao implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /*Nome do equipamento.*/
    @Column(nullable = false, length = 30)
    private String nomeEquipo;
    
    /*Descrição do equipamento, se necessário.*/
    @Column(nullable = true, length = 60)
    private String descricaoEquipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public String getNomeEquipo() {
        return nomeEquipo;
    }

    public void setNomeEquipo(String nomeEquipo) {
        this.nomeEquipo = nomeEquipo;
    }

    public String getDescricaoEquipo() {
        return descricaoEquipo;
    }

    public void setDescricaoEquipo(String descricaoEquipo) {
        this.descricaoEquipo = descricaoEquipo;
    }
    
    
    
}
