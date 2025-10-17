public class Main {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0]= new Lutador("pretty boy", "França", 31, 1.75f, 68.9f,11,2,1);
        l[1] = new Lutador("putScript", "brasil", 25, 1.86f, 68.6f, 5, 8, 3);

        Luta UEC01 = new Luta();
        UEC01.marcar(l[0], l[1]);
        UEC01.lutar();

        l[0].apresentar();
        l[1].apresentar();

    }
}
