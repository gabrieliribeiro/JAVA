public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(24,45697);
        System.out.println(conta.getAgencia());
        Conta conta1 = new Conta(24, 46598);
        Conta conta2 = new Conta(24, 51651);

        System.out.println("Total de contas: " + Conta.getTotal());

    }
}
