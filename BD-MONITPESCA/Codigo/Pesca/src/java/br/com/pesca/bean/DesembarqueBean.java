package br.com.pesca.bean;

import br.com.pesca.dao.AreaPescaXDadosEsforcoDAO;
import br.com.pesca.entidade.AreaPescaXDadosEsforco;
import br.com.pesca.entidade.Desembarque;
import br.com.pesca.entidade.Viagem;
import br.com.pesca.tx.Transactional;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.util.Messages;

/**
 *
 * @author efraim
 */
@Named
@ViewScoped
public class DesembarqueBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private AreaPescaXDadosEsforco areaPescaXDadosEsforco;

    @Inject
    private Desembarque desembarque;
    
    @Inject
    private Viagem viagem;

    @Inject
    private AreaPescaXDadosEsforcoDAO areaPescaXDadosEsforcoDAO;

    public void novoDadosEsforco() {
        areaPescaXDadosEsforco = new AreaPescaXDadosEsforco();
    }

    @Transactional
    public void salvar() {
        areaPescaXDadosEsforcoDAO.salvar(areaPescaXDadosEsforco);
        Messages.addGlobalInfo("Registro salvo com sucesso");
    }

    public Desembarque getDesembarque() {
        return desembarque;
    }

    public void setDesembarque(Desembarque desembarque) {
        this.desembarque = desembarque;
    }

    public AreaPescaXDadosEsforco getAreaPescaXDadosEsforco() {
        return areaPescaXDadosEsforco;
    }

    public void setAreaPescaXDadosEsforco(AreaPescaXDadosEsforco areaPescaXDadosEsforco) {
        this.areaPescaXDadosEsforco = areaPescaXDadosEsforco;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }
    
    

}
