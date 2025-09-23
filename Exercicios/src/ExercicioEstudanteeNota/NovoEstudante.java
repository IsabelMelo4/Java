package ExercicioEstudanteeNota;

import java.util.Arrays;

public class NovoEstudante {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        estudante1.nome = "Isabel";
        estudante1.matricula = 202510001l;
        estudante1.inserirNotas();


        System.out.println(estudante1.nome);
        System.out.println(estudante1.matricula);
        System.out.println(Arrays.toString(estudante1.notas));

    }

}
