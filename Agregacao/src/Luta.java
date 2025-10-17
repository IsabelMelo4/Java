import java.util.Random;

public class Luta {
    //atributos

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //metodos

    public void marcar(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.desafiado = l1;
            this.desafiante = l2;
            this.aprovada = true;
        }

        else{
            this.aprovada = false;
            this.desafiante= null;
            this.desafiado = null;
        }
    }

    public void lutar(){
        if(this.aprovada){
            System.out.printf("## desafiado");
            this.desafiado.apresentar();
            System.out.printf("## desafiante");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.printf("empatou");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.printf("venceu a luta o  " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.printf("venceu  a luta o " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;


            }



        }

        else {
            System.out.printf("A luta não pode acontecer");
        }
    }

    //metodos getters e setters


    public Lutador getDesafiante() {
        return desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public int getRounds() {
        return rounds;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
