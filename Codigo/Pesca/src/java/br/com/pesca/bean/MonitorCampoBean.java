package br.com.pesca.bean;

import br.com.pesca.dao.AreaPescaDAO;
import br.com.pesca.dao.MonitorCampoDAO;
import br.com.pesca.entidade.AreaPescaXDadosEsforco;
import br.com.pesca.entidade.MonitorCampo;
import br.com.pesca.tx.Transactional;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.util.Messages;


@Named
@ViewScoped
public class MonitorCampoBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private MonitorCampo bean;
    
    @Inject
    private MonitorCampoDAO dao;
    
    
    @Transactional
    public void salvar() {
        dao.salvar(bean);
        Messages.addGlobalInfo("Registro salvo com sucesso");
    }

    public MonitorCampo getBean() {
        return bean;
    }

    public void setBean(MonitorCampo bean) {
        this.bean = bean;
    }

    
  
}
