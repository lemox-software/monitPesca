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

/**
 * Armazena o histórico de login e logout no sistema.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */
@Entity
@Table(name = "loginAudit  ")
public class LoginAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;

    /*Chave estrangeira para a tabela de usuários.*/
    @ManyToOne
    @JoinColumn(name = "fk_usuario_id", referencedColumnName = "id", nullable = false)
    private Usuario fk_usuario_id;

    /*Data do login no sistema.*/
    @Column(nullable = false)
    private Date dataLogin;

    /*Data de logout do sistema.*/
    @Column(nullable = false)
    private Date dataLogout;

    /*Hora do login no sistema.*/
    @Column(nullable = false)
    private Date horaLogin;

    /*Hora do logout no sistema.*/
    @Column(nullable = false)
    private Date horaLogout;

    /*Endereço IP de origem da conexão.*/
    @Column(nullable = false, length = 40)
    private String enderecoIp;

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

    public Date getDataLogin() {
        return dataLogin;
    }

    public void setDataLogin(Date dataLogin) {
        this.dataLogin = dataLogin;
    }

    public Date getDataLogout() {
        return dataLogout;
    }

    public void setDataLogout(Date dataLogout) {
        this.dataLogout = dataLogout;
    }

    public Date getHoraLogin() {
        return horaLogin;
    }

    public void setHoraLogin(Date horaLogin) {
        this.horaLogin = horaLogin;
    }

    public Date getHoraLogout() {
        return horaLogout;
    }

    public void setHoraLogout(Date horaLogout) {
        this.horaLogout = horaLogout;
    }

    public String getEnderecoIp() {
        return enderecoIp;
    }

    public void setEnderecoIp(String enderecoIp) {
        this.enderecoIp = enderecoIp;
    }
    
    

}
