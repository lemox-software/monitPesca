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

/**Relação das entidades que sofrerão o processo de auditoria DAO.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "entidadeAuditavel")
public class EntidadeAuditavel implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /*Nome da entidade que sofrerá auditoria.*/
    @Column(nullable = true, length = 30)
    private String nomeEntidade;
    
    /*Chave estrangeira para a tabela de usuários, a fim de registrar o ID do usuário que solicitou auditoria na entidade.*/
    @ManyToOne
    @JoinColumn(name = "fk_usuario_id", referencedColumnName = "id", nullable = false)
    private Usuario fk_usuario_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public String getNomeEntidade() {
        return nomeEntidade;
    }

    public void setNomeEntidade(String nomeEntidade) {
        this.nomeEntidade = nomeEntidade;
    }

    public Usuario getFk_usuario_id() {
        return fk_usuario_id;
    }

    public void setFk_usuario_id(Usuario fk_usuario_id) {
        this.fk_usuario_id = fk_usuario_id;
    }
    
    
    
}
