package padroescomportamentais.strategy.frete;

public class FreteExpresso implements EstrategiaFrete {

    public float calcular(float peso, float distancia) {
        return peso * distancia * 0.05f + 15.0f;
    }
}