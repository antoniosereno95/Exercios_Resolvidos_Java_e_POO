
package POO_cap_12.Exercicio_04;

public class Disciplina {
    
    protected int codigo;
    protected String nome;
    protected int carga_horaria_geral;
    
    //construtor
    public Disciplina() {
        this.codigo = 0;
        this.nome = "";
        this.carga_horaria_geral = 0;
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

    public int getCarga_horaria_geral() {
        return carga_horaria_geral;
    }

    public void setCarga_horaria_geral(int carga_horaria_geral) {
        this.carga_horaria_geral = carga_horaria_geral;
    }
    
    @Override
    public String toString() {
        return "Disciplina{" + "codigo=" + codigo + ", nome=" + nome + ", carga_horaria_geral=" + carga_horaria_geral + '}';
    }
    
    //metodos da classe

    
}
