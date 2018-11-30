package br.com.pesca.bean;

import br.com.pesca.dao.EquiposEmbarcacaoDAO;
import br.com.pesca.entidade.EquiposEmbarcacao;
import br.com.pesca.tx.Transactional;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.util.Messages;


@Named
@ViewScoped
public class EquiposEmbarcacaoBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private EquiposEmbarcacao bean;
    
    @Inject
    private EquiposEmbarcacaoDAO dao;
    
    
    @Transactional
    public void salvar() {
        dao.salvar(bean);
        Messages.addGlobalInfo("Registro salvo com sucesso");
    }

    public EquiposEmbarcacao getBean() {
        return bean;
    }

    public void setBean(EquiposEmbarcacao bean) {
        this.bean = bean;
    }

   
  
}
