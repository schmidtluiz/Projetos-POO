
package estudosquarentena07;

public class EstudosQuarentena07 {

    public static void main(String[] args) {
        Pessoa[] p=new Pessoa[2];
        Livro[] l=new Livro[3]; 
        
        p[0]=new Pessoa("Luiz",27,"Masculino");
        p[1]=new Pessoa("Julia",26,"Feminino");
        l[0]=new Livro("Aprendendo Java","Guanabara",300,p[0]);
        l[1]=new Livro("POO","Curso em video",500,p[1]);
        l[2]=new Livro("XUXU","SHASHA",50,p[1]);
        
        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();
        
        System.out.println(l[0].detalhes());
        
        
           
    }
    
}
