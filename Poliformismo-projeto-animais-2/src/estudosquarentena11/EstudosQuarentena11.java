
package estudosquarentena11;

public class EstudosQuarentena11 {

    public static void main(String[] args) {
        Cachorro c=new Cachorro();
        c.emitirSom();
        c.reagir("Comida");
        c.reagir("Apanhar");
        c.reagir(true);
        c.reagir(15, 30);
        c.reagir(2, 5);
    }
    
}
