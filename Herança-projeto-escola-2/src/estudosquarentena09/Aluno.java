
package estudosquarentena09;

public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    
    public void PagarMensal(){
        System.out.println("Pagando mensalidade de "+this.getNome());
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

 
    public String toString() {
        return "Aluno{" + "matr=" + matr + ", curso=" + curso + '}';
    }
    
    
}
