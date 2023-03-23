public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoRaul = new Conta();
        contaDoRaul.saldo = 100;
        contaDoRaul.deposita(50);

        System.out.println("Saldo da conta do Raul: " + contaDoRaul.saldo);

        contaDoRaul.saca(151);
        System.out.println("Saldo da conta  do Raul: " + contaDoRaul.saldo);

        Conta contaDaGabi =  new Conta();
        contaDaGabi.deposita(1000);

        contaDaGabi.transfere(300, contaDoRaul);
        System.out.println("Saldo atual conta da Gabi: " + contaDaGabi.saldo);
        System.out.println("Saldo da conta  do Raul: " + contaDoRaul.saldo);

        contaDaGabi.titular = "Gabrieli Ribeiro";
        System.out.println("Titular: " + contaDaGabi.titular);


    }
}
