
package Aula_11_herança_parte2;

public class Aluno extends Pessoa {
    /*
    'extends' diz que a classe Aluno é uma generalizaça 
    da classe Pessoa(subclasse).
    */
    private int matricula;
    private String curso;
    
    //metodos
    public void pagarMensalidade(){
        System.out.println("pagando mensalidade do aluno "+this.getNome());
        System.out.println("Pagando a mensalidade do aluno "+this.nome);
        /*o 'this.nome' so funciona pois a variavel nome é do tipo
        'protected' logo a subclasse de Pessoa tbm tem direitos sobre
        a variavel em questao.
        */
    }
    
    //construtor
    public Aluno() {
        this.matricula = 0;
        this.curso = "";
    }
    
    //getters and setters
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
    
}
