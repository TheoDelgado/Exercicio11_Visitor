package padroescomportamentais.strategy.frete;

public class Pedido {

    private float valorFrete;

    public float getValorFrete() {
        return valorFrete;
    }

    public void calcularFreteEconomico(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadora.calcular(new FreteEconomico());
    }

    public void calcularFreteExpresso(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadora.calcular(new FreteExpresso());
    }

    public void calcularFreteRetirada(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadora.calcular(new FreteRetirada());
    }

    public void calcularFreteLocal(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadora.calcular(new FreteLocal());
    }

}