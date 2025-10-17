public class Main {
    public static void main(String[] args) {

        Pessoa l1 = new Pessoa("isabel","feminino", 15 );

        Livro novoLivro = new Livro();
        novoLivro.setLeitor(l1);
        novoLivro.setTotPag(10);
        novoLivro.setAutor("hedra");
        novoLivro.setTitulo("livro dos dinossauros");
        novoLivro.abrir();
        novoLivro.status();
        novoLivro.avancarPagina();
        novoLivro.folhear();
        novoLivro.status();

}}