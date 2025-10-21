public class bolsista extends Aluno{

    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){

        System.out.println("renovando bolsa de " + this.getNome());

    }

    @Override
    public void pagarMensalidade(){
        System.out.println("pagando mensalidade de bolsista " + this.getNome());
    }

}
