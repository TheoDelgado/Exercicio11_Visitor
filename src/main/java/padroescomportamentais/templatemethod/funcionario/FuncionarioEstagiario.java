package padroescomportamentais.templatemethod.funcionario;

public class FuncionarioEstagiario extends Funcionario {

    public float calcularSalarioLiquido() {
        return this.calcularSalarioBruto();
    }

}