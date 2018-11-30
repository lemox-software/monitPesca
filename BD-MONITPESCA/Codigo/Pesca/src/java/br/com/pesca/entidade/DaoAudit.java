
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

/**Registra as ações dos usuários nas tabelas principais do sistema, para auditoria.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */

@Entity
@Table(name = "daoAudit ")
public class DaoAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;
    
    /**Data da ação no sistema. */
    @Column(nullable = false)
    private Date dataAcao;
    
    /**Hora da ação no sistema. */
    @Column(nullable = false)
    private Date horaAcao;
    
    /**Registra as possíveis ações DAO nos registros: insert, update ou delete. */
    @Column(nullable = false)
    private String acaoDao;
    
    /**Chave estrangeira para a tabela de usuários. */
    @ManyToOne
    @JoinColumn(name = "fk_usuario_id", referencedColumnName = "id", nullable = false)
    private Usuario fk_usuario_id;
    
    /**Nome da tabela que sofreu a ação DAO auditada. */
    @Column(nullable = false)
    private String entidadeDao;
    
    /**Id do registro que sofreu a ação DAO auditada. */
    @Column(nullable = false)
    private Integer idRegistroDao;
    
    /**Dump do registro que foi deletado ou alterado. Insert não precisa de dump. */
    @Column(nullable = true)
    private Long dumpRegistroDao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   

    public Date getDataAcao() {
        return dataAcao;
    }

    public void setDataAcao(Date dataAcao) {
        this.dataAcao = dataAcao;
    }

    public Date getHoraAcao() {
        return horaAcao;
    }

    public void setHoraAcao(Date horaAcao) {
        this.horaAcao = horaAcao;
    }

    public String getAcaoDao() {
        return acaoDao;
    }

    public void setAcaoDao(String acaoDao) {
        this.acaoDao = acaoDao;
    }

    public Usuario getFk_usuario_id() {
        return fk_usuario_id;
    }

    public void setFk_usuario_id(Usuario fk_usuario_id) {
        this.fk_usuario_id = fk_usuario_id;
    }

    public String getEntidadeDao() {
        return entidadeDao;
    }

    public void setEntidadeDao(String entidadeDao) {
        this.entidadeDao = entidadeDao;
    }

    public Integer getIdRegistroDao() {
        return idRegistroDao;
    }

    public void setIdRegistroDao(Integer idRegistroDao) {
        this.idRegistroDao = idRegistroDao;
    }

    public Long getDumpRegistroDao() {
        return dumpRegistroDao;
    }

    public void setDumpRegistroDao(Long dumpRegistroDao) {
        this.dumpRegistroDao = dumpRegistroDao;
    }
    
    
    
    
    
}
