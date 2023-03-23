public class TestaBanco {

    public static void main(String[] args) {
        Cliente gabi = new Cliente();

        gabi.nome = "Gabrieli Ribeiro";
        gabi.cpf = "111.111.111-11";
        gabi.profissao = "Desenvolvedora";

        Conta contaGabi = new Conta();

        contaGabi.deposita(1000);

        contaGabi.titular=gabi;

        System.out.println("Titular: " + contaGabi.titular.nome + "\nSaldo: "+ contaGabi.getSaldo());
    }

}
