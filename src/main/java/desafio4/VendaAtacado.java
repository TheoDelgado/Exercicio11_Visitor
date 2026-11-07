package desafio4;

public class VendaAtacado extends Venda {

    public float calcularAjuste() {
        return -this.valorProdutos * 0.1f;
    }

    @Override
    public String getTipo() {
        return "VendaAtacado";
    }
}