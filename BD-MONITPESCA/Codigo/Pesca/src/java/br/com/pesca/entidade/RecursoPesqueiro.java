
package br.com.pesca.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**Registros dos diversos recursos pesqueiros utilizados pelas embracações monitoradas.
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "recursoPesqueiro")
public class RecursoPesqueiro implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /*Nome do recurso pesqueiro. Ex camarão, cação, olhete, etc.*/
    @Column(nullable = false, length = 20)
    private String recursoPesqueiro;
    
    /*Breve descrição do recurso pesqueiro.*/
    @Column(nullable = true, length = 255)
    private String descricaoRecurso;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public String getRecursoPesqueiro() {
        return recursoPesqueiro;
    }

    public void setRecursoPesqueiro(String recursoPesqueiro) {
        this.recursoPesqueiro = recursoPesqueiro;
    }

    public String getDescricaoRecurso() {
        return descricaoRecurso;
    }

    public void setDescricaoRecurso(String descricaoRecurso) {
        this.descricaoRecurso = descricaoRecurso;
    }
    
    
    
    
}
