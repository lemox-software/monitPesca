package br.com.pesca.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * Registro dos desembarques da frota monitorada.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação 20181127
 */
@Entity
@Table(name = "desembarque")
public class Desembarque implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * Chave estrangeira para a tabela de monitores de campo.
     */
    @ManyToOne
    @JoinColumn(name = "fk_monitorCampo_id", referencedColumnName = "id", nullable = false)
    private MonitorCampo fk_monitorCampo_id;

    /**
     * Data do desembarque amostrado.
     */
    @Column(nullable = false)
    private Date dataDesembarque;

    /**
     * Hora do desembarque amostrado.
     */
    @Column(nullable = false)
    private Date horaDesembarque;

    /**
     * Nome do pescador, ou responsável pela embarcação, entrevistado no ato do desembarque.
     */
    @Column(nullable = true, length = 45)
    private String nomeEntrevistado;

    /**
     * Chave estrangeira para a tabela de portos.
     */
    @ManyToOne
    @JoinColumn(name = "fk_porto_id", referencedColumnName = "id", nullable = false)
    private Porto fk_porto_id;

    /**
     * Chave estrangeira para a tabela de viagens.
     */
    @ManyToOne
    @JoinColumn(name = "fk_viagem_id", referencedColumnName = "id", nullable = false)
    private Viagem fk_viagem_id;

    /**
     * Chave estrangeira par a tabela de status dos registros.
     */
    @ManyToOne
    @JoinColumn(name = "fk_statusRegistro_id", referencedColumnName = "id", nullable = false)
    private StatusRegistro fk_statusRegistro_id;
    
    
    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    private List<AreaPescaXDadosEsforco> list_AreaPescaXdadosEsforco = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public MonitorCampo getFk_monitorCampo_id() {
        return fk_monitorCampo_id;
    }

    public void setFk_monitorCampo_id(MonitorCampo fk_monitorCampo_id) {
        this.fk_monitorCampo_id = fk_monitorCampo_id;
    }

    public Date getDataDesembarque() {
        return dataDesembarque;
    }

    public void setDataDesembarque(Date dataDesembarque) {
        this.dataDesembarque = dataDesembarque;
    }

    public Date getHoraDesembarque() {
        return horaDesembarque;
    }

    public void setHoraDesembarque(Date horaDesembarque) {
        this.horaDesembarque = horaDesembarque;
    }

    public String getNomeEntrevistado() {
        return nomeEntrevistado;
    }

    public void setNomeEntrevistado(String nomeEntrevistado) {
        this.nomeEntrevistado = nomeEntrevistado;
    }

    public Porto getFk_porto_id() {
        return fk_porto_id;
    }

    public void setFk_porto_id(Porto fk_porto_id) {
        this.fk_porto_id = fk_porto_id;
    }

    public Viagem getFk_viagem_id() {
        return fk_viagem_id;
    }

    public void setFk_viagem_id(Viagem fk_viagem_id) {
        this.fk_viagem_id = fk_viagem_id;
    }

    public StatusRegistro getFk_statusRegistro_id() {
        return fk_statusRegistro_id;
    }

    public void setFk_statusRegistro_id(StatusRegistro fk_statusRegistro_id) {
        this.fk_statusRegistro_id = fk_statusRegistro_id;
    }

    public List<AreaPescaXDadosEsforco> getList_AreaPescaXdadosEsforco() {
        return list_AreaPescaXdadosEsforco;
    }

    public void setList_AreaPescaXdadosEsforco(List<AreaPescaXDadosEsforco> list_AreaPescaXdadosEsforco) {
        this.list_AreaPescaXdadosEsforco = list_AreaPescaXdadosEsforco;
    }
    

}
