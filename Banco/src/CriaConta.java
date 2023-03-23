public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("Saldo primeira conta: "+ primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println("Saldo primeira conta: "+ primeiraConta.saldo);

        segundaConta.saldo = 400;
        System.out.println("Saldo segunda conta: "+ segundaConta.saldo);

        System.out.println("Agência: "+ primeiraConta.agencia);
        System.out.println("Número: "+ primeiraConta.numero);

        segundaConta.agencia = 52;
        System.out.println("Agência: "+ segundaConta.agencia);
        System.out.println("Número: "+ segundaConta.numero);
    }
}