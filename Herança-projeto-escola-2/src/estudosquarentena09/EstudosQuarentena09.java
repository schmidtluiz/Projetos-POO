
package estudosquarentena09;

public class EstudosQuarentena09 {
    public static void main(String[] args) {
      //Pessoa p1 = new Pessoa();
      Visitante v1 = new Visitante();
      v1.setNome("Luiz");
      v1.setIdade(20);
      v1.setSexo("M");
      v1.fazerAniver();
      //  System.out.println(v1.toString());
        
       Aluno a1 = new Aluno();
       a1.setIdade(32);
       a1.setNome("Marcos");
       a1.setSexo("M");
       //a1.PagarMensal();
       a1.setCurso("TADS");
       a1.setMatr(111);
      // System.out.println(a1.toString());
      
      Bolsista b1 = new Bolsista();
      b1.setIdade(26);
      b1.setNome("Leticia");
      b1.setSexo("F");
      b1.PagarMensal();
      b1.setBolsa(20);
      b1.setCurso("informatica");
      b1.setMatr(2222);
        System.out.println(b1.toString());
      
      
    }
    
}
