package MetodosgGetters;

public class Caneta {

    public String marca;
    private float ponta;

    private String cor;

    private boolean tampada;

    // aqui definimos os atributos, onde eles podem ser publicos
    // privados ou protegidos e nem todos podem acessar


    // metodo construtor

    public Caneta(String m, String c, float p){
        this.marca = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();

    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String m){
        this.marca = m;
    }


    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }


    public void status(){
        System.out.println("sobre a caneta");
        System.out.println("Modelo"+this.marca);
        System.out.println("Ponta" + this.ponta);
        System.out.println("cor" + this.cor);
        System.out.println("tampada" + this.tampada);



    }


}

