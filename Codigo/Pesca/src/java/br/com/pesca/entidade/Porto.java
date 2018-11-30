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

/**Cadastro dos portos onde o programa atua.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "porto")
public class Porto implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /**Nome do porto */
    @Column(nullable = false, length = 30)
    private String nomePorto;
    
    /*Chave estrangeira tabela de comunidades.*/
    @ManyToOne
    @JoinColumn(name = "fk_comunidade", referencedColumnName = "id", nullable = false)
    private Comunidade fk_comunidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public String getNomePorto() {
        return nomePorto;
    }

    public void setNomePorto(String nomePorto) {
        this.nomePorto = nomePorto;
    }

    public Comunidade getFk_comunidade() {
        return fk_comunidade;
    }

    public void setFk_comunidade(Comunidade fk_comunidade) {
        this.fk_comunidade = fk_comunidade;
    }
    

}
