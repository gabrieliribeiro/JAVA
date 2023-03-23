public class TestaGetSet {
    public static void main(String[] args) {
        Conta conta =new Conta(24,8909);

        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente gabi = new Cliente();
        gabi.setNome("Gabrieli Ribeiro");

        conta.setTitular(gabi);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programadora");
        
    }
}
