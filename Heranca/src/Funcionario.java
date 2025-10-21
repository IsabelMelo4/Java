public class Funcionario extends Pessoa {

    private String cargo;

    private float salario;

    public void receberAumento(){}


    public String getCargo() {
        return cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
