package padroesestruturais.bridge.lavagem;

public class LavagemCompleta extends Servico {

    public LavagemCompleta(float valorBase) {
        super(valorBase);
    }

    public float calcularCusto() {
        return this.valorBase * (1 + this.tipoVeiculo.percentualAdicional());
    }

}