package desafio4;

public abstract class Venda {

    private int numero;
    protected String cliente;
    protected float valorProdutos;
    private EstrategiaPagamento pagamento;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getValorProdutos() {
        return valorProdutos;
    }

    public void setValorProdutos(float valorProdutos) {
        this.valorProdutos = valorProdutos;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.pagamento = PagamentoFactory.obterEstrategia(formaPagamento);
    }

    public abstract float calcularAjuste();

    public String getTipo() {
        return "Venda";
    }

    public float calcularTotal() {
        if (this.pagamento == null) {
            throw new IllegalStateException("Forma de pagamento não definida");
        }
        float subtotal = this.valorProdutos + this.calcularAjuste();
        return this.pagamento.calcular(subtotal);
    }

    public String getInfo() {
        return getTipo() + "{" +
                "numero=" + this.numero +
                ", cliente='" + this.cliente + '\'' +
                ", total=" + this.calcularTotal() +
                '}';
    }
}