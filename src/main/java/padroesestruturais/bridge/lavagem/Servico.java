package padroesestruturais.bridge.lavagem;

public abstract class Servico {

    protected TipoVeiculo tipoVeiculo;

    protected float valorBase;

    public Servico(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularCusto();
}