package padroescomportamentais.templatemethod.funcionario;

public abstract class Funcionario {

    private int matricula;
    protected String nome;
    private float salarioBase;
    private float bonus;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float calcularSalarioBruto() {
        return this.salarioBase + this.bonus;
    }

    public abstract float calcularSalarioLiquido();

    public String getTipo() {
        return "Funcionario";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "matricula=" + this.matricula +
                ", nome='" + this.nome + '\'' +
                ", salarioLiquido=" + this.calcularSalarioLiquido() +
                '}';
    }
}