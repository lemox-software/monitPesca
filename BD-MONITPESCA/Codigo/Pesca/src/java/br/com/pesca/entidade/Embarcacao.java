package br.com.pesca.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cadastro das embarcações
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */
@Entity
@Table(name = "embarcacao ")
public class Embarcacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * Chave estrangeira da tabea de comunidades.
     */
    @ManyToOne
    @JoinColumn(name = "fk_comunidade_id", referencedColumnName = "id", nullable = false)
    private Comunidade fk_comunidade_id;

    /**
     * Data de registro da embarcação no sistema.
     */
    @Column(nullable = false)
    private Date dataRegistro;

    /**
     * Nome do barco
     */
    @Column(nullable = false, length = 30)
    private String nomeEmbarcacao;

    /**
     * Nome do proprietário do barco.
     */
    @Column(nullable = true, length = 60)
    private String nomeProprietario;

    /**
     * Chave estrangeira para a tabela de portos.
     */
    @ManyToOne
    @JoinColumn(name = "fk_portoPrincipal_id", referencedColumnName = "id", nullable = false)
    private Porto fk_portoPrincipal_id;

    /**
     * Número de tripulantes da embarcação.
     */
    @Column(nullable = true)
    private Integer numTripulantes;

    /**
     * Potência do motor da embarcação em HP.
     */
    @Column(nullable = true)
    private Integer potenciaMotor;

    /**
     * Comprimento do casco da embarcação em metros.
     */
    @Column(nullable = true)
    private Integer comprimentoCasco;

    /**
     * Chave estrangeira para a tabela de equipamentos da embarcação
     * equiposEmbarcacao.
     */
//    @ManyToOne
//    @JoinColumn(name = "fk_equiposEmbarcacao_id", referencedColumnName = "id", nullable = false)
//    private EquiposEmbarcacao fk_equiposEmbarcacao_id;

    /**
     * Chave estrangeira tabela de artefatos de pesca artefatosPesca.
     */
//    @ManyToOne
//    @JoinColumn(name = "fk_artefatosPesca_id", referencedColumnName = "id", nullable = false)
//    private ArtefatosPesca fk_artefatosPesca_id;

    /**
     * Tempo em dias que a embarcação pode ficar no mar sem precisar de
     * reabastecimento (de combustível ou outros insumos).
     */
    @Column(nullable = true)
    private Integer duracaoDiasMar;

    /**
     * Capacidade de carga da embarcação em toneladas.
     */
    @Column(nullable = true)
    private Integer capacidadeCaga;

    /**
     * Define se a embarcação está pescando ou fora de atividade. Os estados da
     * embarcação serão controlados pela camada de regra de negócios.
     */
    @Column(nullable = false)
    private String statusEmbarcacao;

    /**
     * Chave estrangeira para tabela de status dos registros.
     */
    @ManyToOne
    @JoinColumn(name = "fk_statusRegistro_id", referencedColumnName = "id", nullable = false)
    private StatusRegistro fk_statusRegistro_id;
    
    
    @OneToMany(mappedBy = "fk_artePesca", cascade = {CascadeType.PERSIST})
    private List<ArtePesca> list_ArtePescas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Comunidade getFk_comunidade_id() {
        return fk_comunidade_id;
    }

    public void setFk_comunidade_id(Comunidade fk_comunidade_id) {
        this.fk_comunidade_id = fk_comunidade_id;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getNomeEmbarcacao() {
        return nomeEmbarcacao;
    }

    public void setNomeEmbarcacao(String nomeEmbarcacao) {
        this.nomeEmbarcacao = nomeEmbarcacao;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public Porto getFk_portoPrincipal_id() {
        return fk_portoPrincipal_id;
    }

    public void setFk_portoPrincipal_id(Porto fk_portoPrincipal_id) {
        this.fk_portoPrincipal_id = fk_portoPrincipal_id;
    }

    public Integer getNumTripulantes() {
        return numTripulantes;
    }

    public void setNumTripulantes(Integer numTripulantes) {
        this.numTripulantes = numTripulantes;
    }

    public Integer getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(Integer potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public Integer getComprimentoCasco() {
        return comprimentoCasco;
    }

    public void setComprimentoCasco(Integer comprimentoCasco) {
        this.comprimentoCasco = comprimentoCasco;
    }


    public Integer getDuracaoDiasMar() {
        return duracaoDiasMar;
    }

    public void setDuracaoDiasMar(Integer duracaoDiasMar) {
        this.duracaoDiasMar = duracaoDiasMar;
    }

    public Integer getCapacidadeCaga() {
        return capacidadeCaga;
    }

    public void setCapacidadeCaga(Integer capacidadeCaga) {
        this.capacidadeCaga = capacidadeCaga;
    }

    public String getStatusEmbarcacao() {
        return statusEmbarcacao;
    }

    public void setStatusEmbarcacao(String statusEmbarcacao) {
        this.statusEmbarcacao = statusEmbarcacao;
    }

    public StatusRegistro getFk_statusRegistro_id() {
        return fk_statusRegistro_id;
    }

    public void setFk_statusRegistro_id(StatusRegistro fk_statusRegistro_id) {
        this.fk_statusRegistro_id = fk_statusRegistro_id;
    }

    public List<ArtePesca> getList_ArtePescas() {
        return list_ArtePescas;
    }

    public void setList_ArtePescas(List<ArtePesca> list_ArtePescas) {
        this.list_ArtePescas = list_ArtePescas;
    }
    
    

}
