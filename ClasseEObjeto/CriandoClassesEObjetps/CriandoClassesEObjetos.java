package CriandoClassesEObjetps;

public class CriandoClassesEObjetos {

    String modelo;
    String cor;

    boolean tampada;

    void tampar(){
        this.tampada = true;

    }

    void  rabiscar(){

        if(this.tampada == true) {
            System.out.println("Está tampada!");

        } else {
                System.out.println("Está destampada");
            }
        }
    }


