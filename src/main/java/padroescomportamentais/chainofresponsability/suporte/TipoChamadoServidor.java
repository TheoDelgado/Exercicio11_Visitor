package padroescomportamentais.chainofresponsability.suporte;

public class TipoChamadoServidor implements TipoChamado {

    private static TipoChamadoServidor tipoChamadoServidor = new TipoChamadoServidor();

    private TipoChamadoServidor() {};

    public static TipoChamadoServidor getTipoChamadoServidor() {
        return tipoChamadoServidor;
    }
}