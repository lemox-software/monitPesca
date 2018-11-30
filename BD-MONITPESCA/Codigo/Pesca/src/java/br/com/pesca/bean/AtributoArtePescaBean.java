package br.com.pesca.bean;

import br.com.pesca.dao.AtributoArtePescaDAO;
import br.com.pesca.entidade.AtributoArtePesca;
import br.com.pesca.tx.Transactional;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.util.Messages;


@Named
@ViewScoped
public class AtributoArtePescaBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private AtributoArtePesca bean;
    
    @Inject
    private AtributoArtePescaDAO dao;
    
    
    @Transactional
    public void salvar() {
        dao.salvar(bean);
        Messages.addGlobalInfo("Registro salvo com sucesso");
    }

    public AtributoArtePesca getBean() {
        return bean;
    }

    public void setBean(AtributoArtePesca bean) {
        this.bean = bean;
    }

   
  
}
