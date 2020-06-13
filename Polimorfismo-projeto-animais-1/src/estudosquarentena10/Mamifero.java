
package estudosquarentena10;

public class Mamifero extends Animal {
    
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Correr");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
        return "Mamifero{"+super.toString() + "corPelo=" + corPelo + '}';
    }
    
    
    
    
}
