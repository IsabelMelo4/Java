package VisibilidadeDeMetodosEAtributos;

public class ObjExercicio {
    public static void main(String[] args) {

        Exercicio ObjCanenta = new Exercicio();

        ObjCanenta.cor = "Azul";
        ObjCanenta.modelo = "Big";
        // ObjCanenta.tampada = false;

        ObjCanenta.tampar();
        ObjCanenta.rabiscar();


    }

}
