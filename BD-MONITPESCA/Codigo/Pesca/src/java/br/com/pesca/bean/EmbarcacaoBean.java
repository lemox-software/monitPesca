package br.com.pesca.bean;

import br.com.pesca.dao.EmbarcacaoDAO;
import br.com.pesca.entidade.ArtePescaXEmbarcacao;
import br.com.pesca.entidade.Embarcacao;
import br.com.pesca.tx.Transactional;
import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.util.Messages;

@Named
@ViewScoped
public class EmbarcacaoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Embarcacao bean;
    
    @Inject
    private ArtePescaXEmbarcacao arteDePescaXembarcacao;

    @Inject
    private EmbarcacaoDAO dao;

    private List<Embarcacao> lista;

    @Transactional
    public void salvar() {
        dao.salvar(bean);
        Messages.addGlobalInfo("Registro salvo com sucesso");
    }
    
    public void novoArtePesca() {
        arteDePescaXembarcacao = new ArtePescaXEmbarcacao();
    }

    public Embarcacao getBean() {
        return bean;
    }

    public void setBean(Embarcacao bean) {
        this.bean = bean;
    }

    public List<Embarcacao> getLista() {
        if (lista == null) {
            lista = dao.listar();
        }

        return lista;
    }

    public ArtePescaXEmbarcacao getArteDePescaXembarcacao() {
        return arteDePescaXembarcacao;
    }

    public void setArteDePescaXembarcacao(ArtePescaXEmbarcacao arteDePescaXembarcacao) {
        this.arteDePescaXembarcacao = arteDePescaXembarcacao;
    }
    
    

}
