
package estudosquarentena10;

public class EstudosQuarentena10 {

    public static void main(String[] args) {
        Mamifero m=new Mamifero();
        Reptil r=new Reptil();
        Peixe p=new Peixe();
        Ave a=new Ave();
        Canguru c= new Canguru();
        Dog d= new Dog();
        Tartaruga t = new Tartaruga();
        
        c.setPeso(30.5f);
        c.setIdade(2);
        c.setMembros(2);
        c.setCorPelo("Preto");
        //System.out.println(c.toString());
        //c.locomover();
        //c.alimentar();
        //c.emitirSom();
        //c.usarBolsa();
        
        d.setCorPelo("Marrom");
        d.setIdade(10);
        d.setMembros(4);
        d.setPeso(15.5f);
        //System.out.println(d.toString());
        //d.locomover();
        //d.alimentar();
        //d.emitirSom();
        //d.abanarRabo();
        //d.enterrarOsso();
        
        t.setIdade(50);
        t.setMembros(4);
        t.setPeso(35.8f);
        System.out.println(t.toString());
        t.alimentar();
        t.emitirSom();
        t.locomover();
        
        
        
        
        
        
        
    }
    
}
