public class Main {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0]= new Lutador("pretty boy", "França", 31, 1.75f, 68.9f,11,2,1);
        l[1] = new Lutador("putScript", "brasil", 25, 1.86f, 90.6f, 5, 8, 3);
        l[0].apresentar();
        l[1].apresentar();
        l[0].ganharLuta();
        l[0].apresentar();
    }
}
