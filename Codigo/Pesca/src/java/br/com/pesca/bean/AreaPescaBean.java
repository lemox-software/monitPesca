package br.com.pesca.bean;

import br.com.pesca.dao.AreaPescaDAO;
import br.com.pesca.entidade.AreaPescaXDadosEsforco;
import br.com.pesca.tx.Transactional;
import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.util.Messages;


@Named
@ViewScoped
public class AreaPescaBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
     private AreaPescaXDadosEsforco bean;
            
    
    @Inject
    private AreaPescaDAO dao;
    
    private List<AreaPescaXDadosEsforco> lista;
    
    
    @Transactional
    public void salvar() {
        dao.salvar(bean);
        Messages.addGlobalInfo("Registro salvo com sucAreaPescaXDadosEsforco");
    }
    
     public List<AreaPescaXDadosEsforco> getLista() {
        if (lista == null) {
            lista = dao.listar();
        }

        return lista;
    }

    public AreaPescaXDadosEsforco getBean() {
        return bean;
    }

    public void setBean(AreaPescaXDadosEsforco bean) {
        this.bean = bean;
    }
   
}
