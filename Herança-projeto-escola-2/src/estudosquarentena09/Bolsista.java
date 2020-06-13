
package estudosquarentena09;


public class Bolsista extends Aluno {
    private int bolsa; 
    
    public void RenovarMatric(){
        System.out.println("Renovando bolsa de "+this.getNome());
        
    }
    
    @Override
    public void PagarMensal(){
        System.out.println(this.getNome()+" é bolsista, desconto nescessário");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

  
    public String toString() {
        return "Bolsista{" + "bolsa=" + bolsa + '}';
    }
    
    
}
