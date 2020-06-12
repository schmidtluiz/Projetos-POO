
package estudosquarentena04;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("------------------");
        System.out.println("CONTA: "+this.getNumConta());
        System.out.println("TIPO: "+this.getTipo());
        System.out.println("DONO: "+this.getDono());
        System.out.println("SALDO: "+this.getSaldo());
        System.out.println("STATUS: "+this.getStatus());
        System.out.println("------------------");
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("cc".equals(t)) {
            this.setSaldo(50);
        } else {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso de "+this.getDono());
    }
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta nao pode ser fechada pq ainda tem dinheiro");
        }else if(this.getSaldo()<0){
            System.out.println("Conta nao pode ser fechado pq esta devendo");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito realizado com sucesso na conta de "+this.getDono());
        }else{
            System.out.println("Impossivel depositar");
        }
        
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo()>= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realiazido na conta de "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar");
        } 
    }
    public void pagMensal(){
        int v=0;
        if(this.getTipo()=="cc"){
            v=12;
        }else{
            v=20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso por "+this.getDono());
        }else{
            System.out.println("Impossivel pagar mensalidade");
        }
        
    }
    public void contaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
