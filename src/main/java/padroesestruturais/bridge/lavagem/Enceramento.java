package padroesestruturais.bridge.lavagem;

public class Enceramento extends Servico {

    private int numCamadas;

    public Enceramento(float valorBase) {
        super(valorBase);
    }

    public void setNumCamadas(int numCamadas) {
        this.numCamadas = numCamadas;
    }

    public float calcularCusto() {
        return this.valorBase * this.numCamadas * (1 + this.tipoVeiculo.percentualAdicional());
    }
}