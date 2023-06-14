import javax.swing.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite do cartão: "));
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int opcao = 1;

        while (opcao != 0) {
            String descricao = JOptionPane.showInputDialog("Digite a descrição da compra: ");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da compra"));

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!!");
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para sair ou 1 para continuar..."));
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
                opcao = 0;
            }
        }

        Collections.sort(cartao.getCompras());
        for (Compra c: cartao.getCompras()) {
            JOptionPane.showMessageDialog(null,
                    "|------ COMPRAS REALIZADAS ------|\n"
                            + c.getDescricao() + " - " + c.getValor());
        }
        JOptionPane.showMessageDialog(null, "Saldo do cartão: " + cartao.getSaldo());
    }
}