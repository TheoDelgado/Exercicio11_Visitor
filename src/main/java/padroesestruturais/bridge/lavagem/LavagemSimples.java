package padroesestruturais.bridge.lavagem;

public class LavagemSimples extends Servico {

    public LavagemSimples(float valorBase) {
        super(valorBase);
    }

    public float calcularCusto() {
        return this.valorBase;
    }
}