
package br.com.pesca.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**Usuários do sistema.
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "usuario ")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /*Email utilizado para login do usuário.*/
    @Column(nullable = false, length = 45)
    private String emailUsuario;
    
    /*Primeiro nome do usuário.*/
    @Column(nullable = false, length = 30)
    private String nomeUsuario;
    
    /*Sobrenome completo do usuário.*/
    @Column(nullable = false, length = 45)
    private String sobrenomeUsuario;
    
    /*Senha criptografada.*/
    @Column(nullable = false, length = 255)
    private String senha;
    
    /*Data criação usuário.*/
    @Column(nullable = false)
    private Date dataCriacao;
    
    /*Cargo do usuário.*/
    @Column(nullable = true, length = 30)
    private String cargoUsuario;
    
    /*Matrícula do usuário.*/
    @Column(nullable = true, length = 30)
    private String matriculaUsuario;
    
    /*Documento identificação do usuário.*/
    @Column(nullable = true, length = 16)
    private String docIdentUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSobrenomeUsuario() {
        return sobrenomeUsuario;
    }

    public void setSobrenomeUsuario(String sobrenomeUsuario) {
        this.sobrenomeUsuario = sobrenomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getCargoUsuario() {
        return cargoUsuario;
    }

    public void setCargoUsuario(String cargoUsuario) {
        this.cargoUsuario = cargoUsuario;
    }

    public String getMatriculaUsuario() {
        return matriculaUsuario;
    }

    public void setMatriculaUsuario(String matriculaUsuario) {
        this.matriculaUsuario = matriculaUsuario;
    }

    public String getDocIdentUsuario() {
        return docIdentUsuario;
    }

    public void setDocIdentUsuario(String docIdentUsuario) {
        this.docIdentUsuario = docIdentUsuario;
    }
    
    
    
    
    
    
}
