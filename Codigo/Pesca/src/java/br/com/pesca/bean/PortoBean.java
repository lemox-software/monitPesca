package br.com.pesca.bean;

import br.com.pesca.dao.PortoDAO;
import br.com.pesca.entidade.Porto;
import br.com.pesca.tx.Transactional;
import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.util.Messages;

@Named
@ViewScoped
public class PortoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Porto bean;

    @Inject
    private PortoDAO dao;

    private List<Porto> lista;

    @Transactional
    public void salvar() {
        dao.salvar(bean);
        Messages.addGlobalInfo("Registro salvo com sucesso");
    }

    public Porto getBean() {
        return bean;
    }

    public void setBean(Porto bean) {
        this.bean = bean;
    }

    public List<Porto> getLista() {
        if (lista == null) {
            lista = dao.listar();
        }

        return lista;
    }

}
