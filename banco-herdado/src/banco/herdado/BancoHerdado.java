package banco.herdado;

public class BancoHerdado {

    public static void main(String[] args) {
        Funcionario gabi = new Funcionario();
        
        gabi.setNome("Gabrieli Ribeiro");
        gabi.setCpf("11111111111");
        gabi.setSalario(2600.00);
        
       // System.out.println(gabi.getNome());
       // System.out.println(gabi.getBonificacao());
       
       Gerente g1 = new Gerente();
       g1.setSalario(3000.00);
       System.out.println(g1.getBonificacao());
        
    }
    
}
