package br.com.pesca.bean;

import br.com.pesca.dao.ConservacaoPescadoDAO;
import br.com.pesca.entidade.ConservacaoPescado;
import br.com.pesca.tx.Transactional;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.util.Messages;


@Named
@ViewScoped
public class ConservacaoPescadoBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private ConservacaoPescado bean;
    
    @Inject
    private ConservacaoPescadoDAO dao;
    
    
    @Transactional
    public void salvar() {
        dao.salvar(bean);
        Messages.addGlobalInfo("Registro salvo com sucesso");
    }

    public ConservacaoPescado getBean() {
        return bean;
    }

    public void setBean(ConservacaoPescado bean) {
        this.bean = bean;
    }

   
  
}
