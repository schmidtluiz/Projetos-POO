
package estudosquarentena08;

public class EstudosQuarentena08 {

    public static void main(String[] args) {
        Aluno a=new Aluno();
        Professor p=new Professor();
        Funcionario f=new Funcionario();
        
        a.setNome("Pedro");
        p.setNome("Alfredo");
        f.setNome("Claudia");
        a.setIdade(20);
        p.setIdade(50);
        f.setIdade(35);
        a.setSexo("Masculino");
        p.setSexo("Masculino");
        f.setSexo("Feminino");
        
        System.out.println(a.toString());
        System.out.println(p.toString());
        System.out.println(f.toString());
        
    }
    
}
