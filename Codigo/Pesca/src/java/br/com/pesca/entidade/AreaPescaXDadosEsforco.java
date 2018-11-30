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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Registro das diversas áreas de pesca onde a embarcação atuou.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */
@Entity
public class AreaPescaXDadosEsforco implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;

    /*Nome do pesqueiro*/
    @Column(nullable = true, length = 45)
    private String nomePesqueiro;

    /*Identificção do quadrante estatístico.*/
    @Column(nullable = false, length = 8)
    private String codigoQuadrante;

    /*Profundidade do pesqueiro.*/
    @Column(nullable = true)
    private float profundidade;

    /*Tempo de duração da viagem até o pesqueiro.*/
   // @Temporal(TemporalType.TIME)
    @Column(nullable = true)
    private Date duracaoViagem;

    /*Tempo que a arte de pesca ficou no mar.*/
    //@Temporal(TemporalType.TIME)
    @Column(nullable = true)
    private Date tempoArteNoMar;

    /**
     * Chave estrangeira par a tabela da tabela Arte de Pesca
     */
    @ManyToOne
    @JoinColumn(name = "fk_artePesca_id", referencedColumnName = "id", nullable = false)
    private ArtePesca fk_artePesca_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomePesqueiro() {
        return nomePesqueiro;
    }

    public void setNomePesqueiro(String nomePesqueiro) {
        this.nomePesqueiro = nomePesqueiro;
    }

    public String getCodigoQuadrante() {
        return codigoQuadrante;
    }

    public void setCodigoQuadrante(String codigoQuadrante) {
        this.codigoQuadrante = codigoQuadrante;
    }

    public float getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(float profundidade) {
        this.profundidade = profundidade;
    }

    public Date getDuracaoViagem() {
        return duracaoViagem;
    }

    public void setDuracaoViagem(Date duracaoViagem) {
        this.duracaoViagem = duracaoViagem;
    }

    public Date getTempoArteNoMar() {
        return tempoArteNoMar;
    }

    public void setTempoArteNoMar(Date tempoArteNoMar) {
        this.tempoArteNoMar = tempoArteNoMar;
    }

    public ArtePesca getFk_artePesca_id() {
        return fk_artePesca_id;
    }

    public void setFk_artePesca_id(ArtePesca fk_artePesca_id) {
        this.fk_artePesca_id = fk_artePesca_id;
    }
    
    

}
