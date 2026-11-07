package padroescomportamentais.chainofresponsability.suporte;

import java.util.ArrayList;

public abstract class Atendente {

    protected ArrayList listaChamados = new ArrayList();
    private Atendente atendenteSuperior;

    public Atendente getAtendenteSuperior() {
        return atendenteSuperior;
    }

    public void setAtendenteSuperior(Atendente atendenteSuperior) {
        this.atendenteSuperior = atendenteSuperior;
    }

    public abstract String getDescricaoNivel();

    public String atenderChamado(Chamado chamado) {
        if (listaChamados.contains(chamado.getTipoChamado())) {
            return getDescricaoNivel();
        }
        else {
            if (atendenteSuperior != null) {
                return atendenteSuperior.atenderChamado(chamado);
            }
            else
            {
                return "Sem atendimento";
            }
        }
    }
}