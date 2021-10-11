
package Aula_10_herança_parte1;

public class Aluno extends Pessoa{
    
    private int matricula;
    private String curso;

    public Aluno() {
        this.matricula = 0;
        this.curso = "";
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void cancelarMatricula(){
        this.matricula = 0;
    }
        
}
