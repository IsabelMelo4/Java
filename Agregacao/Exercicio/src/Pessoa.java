public class Pessoa {

    //atributos
    private String nome;
    private int idade;
    private String sexo;

    //metodos

    public void fazerAniversario(){
        this.idade = +1;
    }

    //getters

    public String getNome(){
        return nome;
    }

    public String getSexo(){
        return sexo;
    }

    public int getIdade(){
        return idade;
    }

    //setters
    public void setNome(){
        this.nome = nome;
    }

    public void setIdade(){
        this.idade = idade;
    }

    public void setSexo(){
        this.sexo = sexo;
    }

    //construtor

    public Pessoa(String nome, String sexo, int idade){
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }

    //status

    public void status2(){
        System.out.println("----------------------------------");
        System.out.println("nome " + this.getNome());
        System.out.println("sexo " + this.getSexo()) ;
        System.out.println("idade " + this.getIdade());
        System.out.println("------------------------------------");
    }

}
