
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

/**Registro dos dados referente a viagem que originou o desembarque.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "viagem ")
public class Viagem implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /**Chave estrangeira para a tabela de embarcações.*/
    @ManyToOne
    @JoinColumn(name = "fk_embarcacao_id", referencedColumnName = "id", nullable = false)
    private Embarcacao fk_embarcacao_id;
    
    /**Número de pescadores para a viagem específica de um dada embarcação.*/
    @Column(nullable = true)
    private Integer quantidadeDePescadores;
    
    /**Data da saída da embarcação.*/
    @Column(nullable = true)
    private Date dataSaida;
    
    /**Hora da saída da embarcação.*/
    @Column(nullable = true)
    private Date horaSaida;
    
    /*Data da chegada da embarcação no porto.*/
    @Column(nullable = true)
    private Date dataChegada;
    
    /**Hora da chegada da embarcação no porto.*/
    @Column(nullable = true)
    private Date horaChegada;
    
    /**Chave estrangeira para a tabela de áreas de pesca.*/
    @ManyToOne
    @JoinColumn(name = "fk_areaPesca_id", referencedColumnName = "id", nullable = false)
    private AreaPescaXDadosEsforco fk_areaPesca_id;
    
    /**Chave estrangeira para a tabela de dados de esforço da viagem.*/
    @ManyToOne
    @JoinColumn(name = "fk_areaPescaXDadosEsforco_id", referencedColumnName = "id", nullable = false)
    private AreaPescaXDadosEsforco fk_areaPescaXDadosEsforco_id;
    
    /**Chave estrangeira para a tabela consevação do pescado*/
    @ManyToOne
    @JoinColumn(name = "fk_conservacaoPescado_id", referencedColumnName = "id", nullable = false)
    private ConservacaoPescado fk_conservacaoPescado_id;
    
    /**Peso total em kg da captura na viagem*/
    @Column(nullable = true)
    private float pesoCapturaTotal;
    
    /**Custo total da pescaria.*/
    @Column(nullable = true)
    private float custoPescaria;
    
    /**Dias para a próxima pescaria.*/
    @Column(nullable = false)
    private Integer diasProximaPescaria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public Embarcacao getFk_embarcacao_id() {
        return fk_embarcacao_id;
    }

    public void setFk_embarcacao_id(Embarcacao fk_embarcacao_id) {
        this.fk_embarcacao_id = fk_embarcacao_id;
    }

    public Integer getQuantidadeDePescadores() {
        return quantidadeDePescadores;
    }

    public void setQuantidadeDePescadores(Integer quantidadeDePescadores) {
        this.quantidadeDePescadores = quantidadeDePescadores;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public Date getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(Date horaChegada) {
        this.horaChegada = horaChegada;
    }

    public AreaPescaXDadosEsforco getFk_areaPesca_id() {
        return fk_areaPesca_id;
    }

    public void setFk_areaPesca_id(AreaPescaXDadosEsforco fk_areaPesca_id) {
        this.fk_areaPesca_id = fk_areaPesca_id;
    }

    public AreaPescaXDadosEsforco getFk_areaPescaXDadosEsforco_id() {
        return fk_areaPescaXDadosEsforco_id;
    }

    public void setFk_areaPescaXDadosEsforco_id(AreaPescaXDadosEsforco fk_areaPescaXDadosEsforco_id) {
        this.fk_areaPescaXDadosEsforco_id = fk_areaPescaXDadosEsforco_id;
    }

  

    public ConservacaoPescado getFk_conservacaoPescado_id() {
        return fk_conservacaoPescado_id;
    }

    public void setFk_conservacaoPescado_id(ConservacaoPescado fk_conservacaoPescado_id) {
        this.fk_conservacaoPescado_id = fk_conservacaoPescado_id;
    }

    public float getPesoCapturaTotal() {
        return pesoCapturaTotal;
    }

    public void setPesoCapturaTotal(float pesoCapturaTotal) {
        this.pesoCapturaTotal = pesoCapturaTotal;
    }

    public float getCustoPescaria() {
        return custoPescaria;
    }

    public void setCustoPescaria(float custoPescaria) {
        this.custoPescaria = custoPescaria;
    }

    public Integer getDiasProximaPescaria() {
        return diasProximaPescaria;
    }

    public void setDiasProximaPescaria(Integer diasProximaPescaria) {
        this.diasProximaPescaria = diasProximaPescaria;
    }
    
    
    
    
    
    
}
