
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

/**Registro das diversas artes de pesca utilizada por uma embarcção.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "artePescaXDesembarque ")
public class ArtePescaXDesembarque implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /**Chave estrangeira para a tabela de desembarque.*/
    @ManyToOne
    @JoinColumn(name = "fk_desembarque_id", referencedColumnName = "id", nullable = false)
    private Desembarque fk_desembarque_id;
    
    /**Chave estrangeira para a tabela de artes de pesca.*/
    @ManyToOne
    @JoinColumn(name = "fk_artePesca_id", referencedColumnName = "id", nullable = false)
    private ArtePesca fk_artePesca_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Desembarque getFk_desembarque_id() {
        return fk_desembarque_id;
    }

    public void setFk_desembarque_id(Desembarque fk_desembarque_id) {
        this.fk_desembarque_id = fk_desembarque_id;
    }

    public ArtePesca getFk_artePesca_id() {
        return fk_artePesca_id;
    }

    public void setFk_artePesca_id(ArtePesca fk_artePesca_id) {
        this.fk_artePesca_id = fk_artePesca_id;
    }
    
    
    
    
    
}
