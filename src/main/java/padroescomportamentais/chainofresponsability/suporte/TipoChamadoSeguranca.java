package padroescomportamentais.chainofresponsability.suporte;

public class TipoChamadoSeguranca implements TipoChamado {

    private static TipoChamadoSeguranca tipoChamadoSeguranca = new TipoChamadoSeguranca();

    private TipoChamadoSeguranca() {};

    public static TipoChamadoSeguranca getTipoChamadoSeguranca() {
        return tipoChamadoSeguranca;
    }
}