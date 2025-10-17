public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPag;
    private boolean aberto;
    private Pessoa leitor;

    //metodos

    public void detalhe(){

    }

    @Override

        public void abrir() {
        if (aberto == false) {
            this.setAberto(true);
            System.out.println("o livro está aberto ");
        }

    }

    @Override
        public void fechar() {
        if (aberto == true){
            this.setAberto(false);
        }
    }
    @Override

    public void folhear(){
        if (aberto){
            for (int i = 1; i < totPag; i++){
                System.out.println("folheando...");
        }
            System.out.println("fim");}
        else{
            System.out.printf("o livro esta fechado");
        }
    }

    @Override

    public void avancarPagina(){
        if (aberto == false){
            System.out.println("o livro esta fechado");
        }
        else if (getTotPag() != 0) {
            this.totPag = totPag - 1;
            System.out.println("vc avançou uma pagina");
        }
        else{
            System.out.printf("vc leu todo o livro");
            }
        }

    @Override

    public void voltarPagina(){
        if (aberto == false){
            System.out.println("o livro esta fechado");
        }
        else if (getTotPag() > 0){
            this.totPag = totPag + 1;
            System.out.println("vc voltou uma pagina");
        }

        else {
            System.out.printf("vc está no comeco");
        }
    }

    public void status(){
        System.out.println("------------------------------------");
        System.out.println("livro " + getTitulo());
        System.out.println("autor " + getAutor());
        System.out.println("Total de paginas " + getTotPag());
        System.out.println("Está aberto? " + isAberto());
        System.out.println("leitor "+ getLeitor());
        System.out.println("-------------------------------------");
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public boolean isAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa l1) {
        this.leitor = l1;
    }


}
