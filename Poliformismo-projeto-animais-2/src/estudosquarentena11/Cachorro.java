
package estudosquarentena11;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom(){
        System.out.println("Latir");
    }
    
    public void reagir(String frase){
        if("comida".equals(frase) || "Olá".equals(frase)){
            System.out.println("Abanar rabo");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int min){
        if(hora<12){
            System.out.println("Abanar rabo");
        }else if(hora>18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar rabo");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int idade, float peso){
        if(idade<5){
            if(peso<10){
                System.out.println("Abanar o rabo");
            }else{
                System.out.println("Latir");
            }
        }else{
            if(peso<10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
    }
    
}
