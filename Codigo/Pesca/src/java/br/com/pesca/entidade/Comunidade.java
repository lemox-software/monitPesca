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
@Table(name = "comunidade")
public class Comunidade implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /*Nome da comunidade. Não necessariamente nme de municípios, sendo desvinculado do cadastro do IBGE.*/
    @Column(nullable = false, length = 60)
    private String nomeComunidade;
    
    /*Município ao qual pertence a comunidade. Seguir cadastro do IBGE.*/
    @Column(nullable = false, length = 60)
    private String municipio;
    
    /*Unidade da Federação (estado) ao qual pertence o município onde a comunidade se estabeleceu.*/
    @Column(nullable = false, length = 2)
    private String ufMunicipio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

   

    public String getNomeComunidade() {
        return nomeComunidade;
    }

    public void setNomeComunidade(String nomeComunidade) {
        this.nomeComunidade = nomeComunidade;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUfMunicipio() {
        return ufMunicipio;
    }

    public void setUfMunicipio(String ufMunicipio) {
        this.ufMunicipio = ufMunicipio;
    }
   
}
