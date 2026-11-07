package padroescomportamentais.strategy.frete;

public class CalculadoraFrete {

    private float peso;
    private float distancia;

    public CalculadoraFrete(float peso, float distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public float calcular(EstrategiaFrete estrategia) {
        return estrategia.calcular(peso, distancia);
    }
}