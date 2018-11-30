
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

/**Registro dos custos individuais da pescaria - viagem.
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "custosPescaria")
public class CustosPescaria implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
     /**Chave estrangeira para a tabela de viagens.*/
    @ManyToOne
    @JoinColumn(name = "fk_viagem_id", referencedColumnName = "id", nullable = false)
    private Viagem fk_viagem_id;
    
    /**Custo com conservação dos pescados.*/
    @Column(nullable = true)
    private float conservacao;
    
    /**Custo com alimentação (rancho) na viagem.*/
    @Column(nullable = true)
    private float rancho;
    
    /**Custo com iscas na viagem.*/
    @Column(nullable = true)
    private float isca;
    
    /**Custo com combustível na viagem.*/
    @Column(nullable = true)
    private float combustivel;
    
    /**Custo com a puxada na viagem.*/
    @Column(nullable = true)
    private float puxada;
    
    /**Outros custos acessórios da viagem.*/
    @Column(nullable = true)
    private float outrosCustos;

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

    public float getConservacao() {
        return conservacao;
    }

    public void setConservacao(float conservacao) {
        this.conservacao = conservacao;
    }

    public float getRancho() {
        return rancho;
    }

    public void setRancho(float rancho) {
        this.rancho = rancho;
    }

    public float getIsca() {
        return isca;
    }

    public void setIsca(float isca) {
        this.isca = isca;
    }

    public float getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(float combustivel) {
        this.combustivel = combustivel;
    }

    public float getPuxada() {
        return puxada;
    }

    public void setPuxada(float puxada) {
        this.puxada = puxada;
    }

    public float getOutrosCustos() {
        return outrosCustos;
    }

    public void setOutrosCustos(float outrosCustos) {
        this.outrosCustos = outrosCustos;
    }
    
    
    
}
