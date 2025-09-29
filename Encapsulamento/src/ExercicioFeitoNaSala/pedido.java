package ExercicioFeitoNaSala;
class Pedido {
    Cliente cliente;

    public void notificarCliente() {
        String nome = cliente.getNome();
        System.out.println(nome + ", seu pedido foi enviado!");
    }
}

