
package estudosquarentena10;

public class Peixe extends Animal {
    
    private String corEscama;
    

    @Override
    public void locomover() {
        System.out.println("Nadar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sons de peixe");
        }

    public void SoltarBolha(){
        System.out.println("Soltando bolhas");
    }
}
