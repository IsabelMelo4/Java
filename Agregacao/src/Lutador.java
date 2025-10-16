public class Lutador {

    // atributos

    private String nome;
    private String nacionalidade;

    private int idade;

    private float altura;

    private float peso;

    private String categoria;

    private int vitorias, derrotas, empates;

    // metodos

    public void apresentar(){
        System.out.println("------------------------------------------");
        System.out.println("Apresentamos o lutador " + this.getNome());
        System.out.println("Na categoria " + this.getCategoria());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com a idade de " +this.getIdade());
        System.out.println("Pesando " + this.getPeso());
        System.out.println("Medindo " + this.getAltura());
        System.out.println("Ganhou " + this.getVitorias());
        System.out.println("Perdeu " + this.getDerrotas());
        System.out.println("empatou " + this.getEmpates());
        System.out.println("------------------------------------------");
    }


    public void status(){

    }


    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getEmpates() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    //metodos especiais


    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        if (this.peso<52.2){
            this.categoria = "invalido";
        }

        else if (this.peso<= 73.3){
            this.categoria = "peso leve";
        }

        else if (this.peso <= 83.9){
            categoria = "peso medio";

        }

        else if (this.peso<=120.2){
            this.categoria = "pesado";

        }

        else{
            this.categoria = "invalido";
        }
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
