
package estudosquarentena04;

public class EstudosQuarentena04 {

    public static void main(String[] args) {
        ContaBanco p1=new ContaBanco();
        p1.setDono("Jubileu");
        p1.setNumConta(0001);
        p1.abrirConta("cc");
        p1.depositar(300);
        p1.pagMensal();
        
        p1.estadoAtual();
        
        ContaBanco p2=new ContaBanco();
        p2.setDono("Creusa");
        p2.setNumConta(0002);
        p2.abrirConta("cp");
        p2.depositar(500);
        p2.pagMensal();
        
        p2.estadoAtual();
        
    }
    
}
