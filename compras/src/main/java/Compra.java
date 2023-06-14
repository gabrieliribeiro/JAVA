import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valor;

    public Compra (String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "|---Compra ---|"
                + "|-Descricao: " + descricao
                + "|-Valor:" + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
