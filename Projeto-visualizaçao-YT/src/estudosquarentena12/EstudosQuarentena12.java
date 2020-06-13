
package estudosquarentena12;

public class EstudosQuarentena12 {

    public static void main(String[] args) {
        Video v[]=new Video[3];
        v[0]=new Video("Aula inicial POO");
        v[1]=new Video("Aula intermediaria POO");
        v[2]=new Video("Aula avançada POO");  
        
        Gafanhoto g=new Gafanhoto("Luiz",27,"M","schmidtluiz");
        
        //System.out.println(v[0].toString());
        //System.out.println(g.toString());
        Visualizacao vis[]=new Visualizacao[3];
        vis[0]=new Visualizacao(g,v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1]=new Visualizacao(g,v[2]);
        vis[1].avaliar(86.5f);
        System.out.println(vis[1].toString());
    }
    
}
