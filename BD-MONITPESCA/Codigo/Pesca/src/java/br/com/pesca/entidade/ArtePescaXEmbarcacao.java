
package br.com.pesca.entidade;

import java.io.Serializable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class ArtePescaXEmbarcacao implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ManyToOne
    @JoinColumn(name = "fk_artePesca_id", nullable = false)
    private ArtePesca fk_artePesca;

    public ArtePesca getFk_artePesca() {
        return fk_artePesca;
    }

    public void setFk_artePesca(ArtePesca fk_artePesca) {
        this.fk_artePesca = fk_artePesca;
    }
    
    
    
}
