
package estudosquarentena11;

public class Mamifero extends Animal {
    
    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Sons de mamiferos");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
