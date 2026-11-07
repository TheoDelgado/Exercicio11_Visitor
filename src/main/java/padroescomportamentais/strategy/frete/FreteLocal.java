package padroescomportamentais.strategy.frete;

public class FreteLocal implements EstrategiaFrete {

    public float calcular(float peso, float distancia) {
        if (distancia > 50) {
            throw new IllegalArgumentException("Distância acima do limite para entrega local");
        }
        else {
            return 5.0f + peso * 0.5f;
        }
    }
}