public class Main {
    public static void main(String[] args) {
      /*  Visitante v1 = new Visitante();
        v1.setNome("isabel");
        v1.setSexo("f");
        v1.setIdade(15);
        System.out.println(v1.toString());*/

        Aluno a1 = new Aluno();
        a1.setNome("isabel");
        a1.setMatricula(15555);
        a1.setCurso("informatica");
        a1.setIdade(16);
        a1.setSexo("m");
        a1.pagarMensalidade();

        bolsista b1 = new bolsista();

        b1.setNome("joao");
        b1.setMatricula(155555);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        b1.renovarBolsa();

    }



}
