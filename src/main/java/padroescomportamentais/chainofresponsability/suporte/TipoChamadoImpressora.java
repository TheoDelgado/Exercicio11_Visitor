package padroescomportamentais.chainofresponsability.suporte;

public class TipoChamadoImpressora implements TipoChamado {

    private static TipoChamadoImpressora tipoChamadoImpressora = new TipoChamadoImpressora();

    private TipoChamadoImpressora() {};

    public static TipoChamadoImpressora getTipoChamadoImpressora() {
        return tipoChamadoImpressora;
    }
}