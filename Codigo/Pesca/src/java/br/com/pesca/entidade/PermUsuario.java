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

/**
 * Definbe as relações de níveis de permissoes dos usuarios.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */
@Entity
@Table(name = "permUsuario")
public class PermUsuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * Chave estrangeira para a tabela de usuarios.
     */
    @ManyToOne
    @JoinColumn(name = "fk_usuario_id", referencedColumnName = "id", nullable = false)
    private Usuario fk_usuario_id;

    /**
     * Define se o usuário é administrador do sistema, com total acesso aos
     * recursos. S=Sim N=Não.
     */
    @Column(nullable = false, length = 30)
    private String isAdmin;

    /**
     * Define se o usuário é tabulador de dados. S=Sim N=Não.
     */
    @Column(nullable = false, length = 30)
    private String isTabulador;

    /**
     * Define se o usuário é coordenador. S=Sim n=Não.
     */
    @Column(nullable = false, length = 30)
    private String isCoordenador;

    /**
     * Define se o usuário é auditor. S=Sim N=Não.
     */
    @Column(nullable = false, length = 30)
    private String isAuditor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public Usuario getFk_usuario_id() {
        return fk_usuario_id;
    }

    public void setFk_usuario_id(Usuario fk_usuario_id) {
        this.fk_usuario_id = fk_usuario_id;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getIsTabulador() {
        return isTabulador;
    }

    public void setIsTabulador(String isTabulador) {
        this.isTabulador = isTabulador;
    }

    public String getIsCoordenador() {
        return isCoordenador;
    }

    public void setIsCoordenador(String isCoordenador) {
        this.isCoordenador = isCoordenador;
    }

    public String getIsAuditor() {
        return isAuditor;
    }

    public void setIsAuditor(String isAuditor) {
        this.isAuditor = isAuditor;
    }

}
