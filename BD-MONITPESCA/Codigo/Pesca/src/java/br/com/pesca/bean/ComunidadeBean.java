package br.com.pesca.bean;

import br.com.pesca.dao.ComunidadeDAO;
import br.com.pesca.entidade.ArtePesca;
import br.com.pesca.entidade.Comunidade;
import br.com.pesca.tx.Transactional;
import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.util.Messages;

@Named
@ViewScoped
public class ComunidadeBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Comunidade bean;

    @Inject
    private ComunidadeDAO dao;

    private List<Comunidade> lista;

    @Transactional
    public void salvar() {
        dao.salvar(bean);
        Messages.addGlobalInfo("Registro salvo com sucesso");
    }

    public Comunidade getBean() {
        return bean;
    }

    public void setBean(Comunidade bean) {
        this.bean = bean;
    }

    public List<Comunidade> getLista() {
        if (lista == null) {
            lista = dao.listar();
        }

        return lista;
    }

}
