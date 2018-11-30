
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

/**Registro das capturas por viagem..
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "recursoXViagem ")
public class RecursoXViagem implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /**Chave estrangeira para a tabela de viagens.*/
    @ManyToOne
    @JoinColumn(name = "fk_viagem_id", referencedColumnName = "id", nullable = false)
    private Viagem fk_viagem_id;
    
    /**Chave estrangeira para a tabela de recursos pesqueiros.*/
    @ManyToOne
    @JoinColumn(name = "fk_recursoPesqueiro_id", referencedColumnName = "id", nullable = false)
    private RecursoPesqueiro fk_recursoPesqueiro_id;
    
    /**Chave estrangeira para a tabela de artes de pesca.*/
    @ManyToOne
    @JoinColumn(name = "fk_artePesca_id", referencedColumnName = "id", nullable = false)
    private ArtePesca fk_artePesca_id;
    
    /**Peso do recurso capturado (em kg).*/
    @Column(nullable = false)
    private float pesoCaptura;
    
    /**Preço por kg do recurso capturado.*/
    @Column(nullable = true)
    private float precoKgRecurso;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public Viagem getFk_viagem_id() {
        return fk_viagem_id;
    }

    public void setFk_viagem_id(Viagem fk_viagem_id) {
        this.fk_viagem_id = fk_viagem_id;
    }

    public RecursoPesqueiro getFk_recursoPesqueiro_id() {
        return fk_recursoPesqueiro_id;
    }

    public void setFk_recursoPesqueiro_id(RecursoPesqueiro fk_recursoPesqueiro_id) {
        this.fk_recursoPesqueiro_id = fk_recursoPesqueiro_id;
    }

    public ArtePesca getFk_artePesca_id() {
        return fk_artePesca_id;
    }

    public void setFk_artePesca_id(ArtePesca fk_artePesca_id) {
        this.fk_artePesca_id = fk_artePesca_id;
    }

    public float getPesoCaptura() {
        return pesoCaptura;
    }

    public void setPesoCaptura(float pesoCaptura) {
        this.pesoCaptura = pesoCaptura;
    }

    public float getPrecoKgRecurso() {
        return precoKgRecurso;
    }

    public void setPrecoKgRecurso(float precoKgRecurso) {
        this.precoKgRecurso = precoKgRecurso;
    }
    
    
    
    
    
}
