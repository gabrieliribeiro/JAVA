public class Conta {
    double saldo;
    int agencia = 42;
    int numero;
    String titular;


    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else {
            System.out.println("\nVocê não tem saldo o suficiente na conta para realizar um saque desse valor!");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            System.out.println("\nValor transferido com sucesso!");
            return true;
        }else {
            System.out.println("\nVocê não tem saldo o suficiente na conta para realizar uma transferência desse valor!");
            return false;
        }
    }
}
