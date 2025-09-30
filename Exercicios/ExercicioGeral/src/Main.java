//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------");

        ContaBanco user1 = new ContaBanco();
        user1.setNumConta(1111);
        user1.setDono("jubileu");
        user1.abrirConta("CC");
        user1.Depositar(300);
        user1.statusExercicio();

        System.out.println("-----------------------");

        ContaBanco user2 = new ContaBanco();
        user2.setDono("Creuza");
        user2.setNumConta(2222);
        user2.abrirConta("CP");
        user2.Depositar(500);
        user2.sacar(800);
        user2.statusExercicio();


    }
}