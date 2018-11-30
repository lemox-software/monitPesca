package br.com.pesca.bean;

import br.com.pesca.dao.ArtePescaDAO;
import br.com.pesca.entidade.ArtePesca;
import br.com.pesca.tx.Transactional;
import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.util.Messages;

@Named
@ViewScoped
public class ArtePescaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private ArtePesca bean;

    @Inject
    private ArtePescaDAO dao;

    private List<ArtePesca> lista;

    @Transactional
    public void salvar() {
        dao.salvar(bean);
        Messages.addGlobalInfo("Registro salvo com sucesso");
    }

    public ArtePesca getBean() {
        return bean;
    }

    public void setBean(ArtePesca bean) {
        this.bean = bean;
    }

    public List<ArtePesca> getLista() {
        if (lista == null) {
            lista = dao.listar();
        }

        return lista;
    }

}
