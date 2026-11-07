package padroescomportamentais.templatemethod.funcionario;

public class FuncionarioCLT extends Funcionario {

    public float calcularSalarioLiquido() {
        return this.calcularSalarioBruto() * 0.8f;
    }

    @Override
    public String getTipo() {
        return "FuncionarioCLT";
    }
}