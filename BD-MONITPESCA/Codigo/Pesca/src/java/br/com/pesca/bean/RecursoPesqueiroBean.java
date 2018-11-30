package br.com.pesca.bean;

import br.com.pesca.dao.AreaPescaDAO;
import br.com.pesca.dao.recursoPesqueiroDAO;
import br.com.pesca.entidade.AreaPescaXDadosEsforco;
import br.com.pesca.entidade.RecursoPesqueiro;
import br.com.pesca.tx.Transactional;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.util.Messages;


@Named
@ViewScoped
public class RecursoPesqueiroBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private RecursoPesqueiro bean;
    
    @Inject
    private recursoPesqueiroDAO dao;
    
    
    @Transactional
    public void salvar() {
        dao.salvar(bean);
        Messages.addGlobalInfo("Registro salvo com sucesso");
    }

    public RecursoPesqueiro getBean() {
        return bean;
    }

    public void setBean(RecursoPesqueiro bean) {
        this.bean = bean;
    }

     
}
