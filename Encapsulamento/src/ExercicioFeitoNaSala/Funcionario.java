package ExercicioFeitoNaSala;

public class Funcionario {
    private  String nome;
    private double salario;
    private int idade;


    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void SalarioIvalido() throws ExcessaoFuncionario{

    }
}
