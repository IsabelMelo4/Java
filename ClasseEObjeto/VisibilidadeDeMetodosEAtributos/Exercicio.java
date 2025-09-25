package VisibilidadeDeMetodosEAtributos;

public class Exercicio {

   public String modelo;
   public String cor;
    private boolean tampada;

   protected int carga;

    protected void tampar(){
        this.tampada = true;

    }

  public void  rabiscar(){

        if(this.tampada == true) {
            System.out.println("Está tampada!");

        } else {
            System.out.println("Está destampada");
        }
    }





    }



