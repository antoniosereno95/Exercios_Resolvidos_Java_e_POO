
package POO_cap_12.Exercicio_04;

public class Aluno {
    
    protected int codigo;
    protected String nome;
    
    //construtor
    public Aluno() {
        this.codigo = 0;
        this.nome = "";
    }
    
    //getters and setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //metodos da classe
    @Override
    public String toString() {
        return "Aluno{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }
    
    
}
