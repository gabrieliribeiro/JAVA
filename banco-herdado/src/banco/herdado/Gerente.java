
package banco.herdado;

public class Gerente extends Funcionario{
    private int senha;
    
    public Gerente(){
        
    }
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
    }
     public double getBonificacao(){
        return  super.getBonificacao() + super.getSalario();
    }
    
}
