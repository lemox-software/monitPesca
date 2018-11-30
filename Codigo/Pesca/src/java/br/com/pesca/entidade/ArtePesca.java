package br.com.pesca.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Registro das artes de pesca utilizadas pelas embarcações monitoradas.
 *
 * @author André Bitencurt
 * @author Efraim Raizer
 * @version 1
 * @since Release 01 da aplicação
 */
@Entity
@Table(name = "artePesca")
public class ArtePesca implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Integer id;

    /*Nome da arte de pesca.*/
    @Column(nullable = false, length = 60)
    private String arteDePesca;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getArteDePesca() {
        return arteDePesca;
    }

    public void setArteDePesca(String arteDePesca) {
        this.arteDePesca = arteDePesca;
    }

}
