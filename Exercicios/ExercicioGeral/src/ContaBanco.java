public class ContaBanco {
//atributos
    public int numConta;
    protected  String tipo;
    private String dono;
    private float saldo;
    private boolean status;

//metodos personalizados
    public void abrirConta(String tp){
        this.setTipo(tp);
        this.setStatus(true);

        if(tp == "CC" ){
            this.setSaldo(50);
        }

        else{
           this.setSaldo(150);
        }
    }

    public void fecharCota(){
        if(this.getSaldo()> 0){
            System.out.println("A conta tem dinheiro ");
        }

        else if (this.getSaldo() < 0 ){
            System.out.println("voce está em divida");
        }

        else {
            this.setStatus(false);
            System.out.println("Conta fechada com suceso");
        }


    }

    public void Depositar(float v){

            if (this.getStatus()){
                this.setSaldo(this.getSaldo() + v );
                System.out.println("deposito realizado com sucesso");

            }

            else {
                System.out.println("Não foi possivel depositar");
            }
    }

    public void sacar(float v){
        if(this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realidado na conta de " + this.getDono());
            }
            else {
                System.out.println("saque insuficiente");
            }
        }

        else{
            System.out.println("Não é possivel sacar de uma conta fechada");
        }

    }


    public void pagarMensalidade(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }

        else if(this.getTipo() == "CP"){
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        }

        else{
            System.out.println("Impossivel realizar pagamento com a conta fechada");
        }


    }

                                            //metodo construtor


    public ContaBanco(){
        this.saldo = 0.0f;
        this.status = false;

    }
                                            //fim do metodo construtor

                                            // getters e setters
    public String getDono() {
        return dono;
    }


    public void setDono(String dono){
        this.dono = dono;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float status){
        this.saldo = status;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;

    }

    //fim dos getters e setters

    public void statusExercicio(){
        System.out.println("dono "+this.getDono());
        System.out.println("tipo "+this.getTipo());
        System.out.println("saldo "+this.getSaldo());
        System.out.println("num conta " + this.getNumConta());
        System.out.println("estado da conta "+this.getStatus());
    }

}
