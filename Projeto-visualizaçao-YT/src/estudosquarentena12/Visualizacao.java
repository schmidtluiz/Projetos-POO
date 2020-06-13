
package estudosquarentena12;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
        
    }
    
    public void avaliar(){
        this.filme.setAvaliaçao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliaçao(nota);
    }

    public void avaliar(float percent){
        int tot;
        if(percent<=20){
            tot=3;
        }else if(percent<=50){
            tot=5;
        }else if(percent<=90){
            tot=8;
        }else{
            tot=10;
        }
        this.filme.setAvaliaçao(tot);
    }


    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
