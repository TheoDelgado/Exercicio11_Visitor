package padroescomportamentais.strategy.frete;

public class FreteEconomico implements EstrategiaFrete {

    public float calcular(float peso, float distancia) {
        return peso * distancia * 0.02f;
    }
}