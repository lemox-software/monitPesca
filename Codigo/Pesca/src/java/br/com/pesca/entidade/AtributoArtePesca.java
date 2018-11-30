package br.com.pesca.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Atributos individuais por arte de pesca.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */
@Entity
@Table(name = "atributoArtePesca ")
public class AtributoArtePesca implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;

    //Atributo específico da arte de pesca.
    @Column(nullable = true, length = 60)
    private String atributoArtePesca;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public String getAtributoArtePesca() {
        return atributoArtePesca;
    }

    public void setAtributoArtePesca(String atributoArtePesca) {
        this.atributoArtePesca = atributoArtePesca;
    }

}
