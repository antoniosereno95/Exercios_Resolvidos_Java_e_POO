
package POO_cap_12.Exercicio_04;

public class Matricula {
    
    protected int ano_letivo;
    protected int serie;
    public Aluno aluno;
    public Disciplina disciplina;
    public DisciplinaPratica disciplinaPratica;
    protected double nota1Bim; //Bim é de bimestre
    protected double nota2Bim;
    protected double nota3Bim;
    protected double nota4Bim;
    
    //construtor
    public Matricula() {
        this.ano_letivo = 0;
        this.serie = 0;
        this.aluno = null;
        this.disciplina = null;
        this.disciplinaPratica = null;
        this.nota1Bim = 0;
        this.nota2Bim = 0;
        this.nota3Bim = 0;
        this.nota4Bim = 0;
    }
    
    //getters and setters
    public int getAno_letivo() {
        return ano_letivo;
    }

    public void setAno_letivo(int ano_letivo) {
        this.ano_letivo = ano_letivo;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota1Bim() {
        return nota1Bim;
    }

    public void setNota1Bim(double nota1Bim) {
        this.nota1Bim = nota1Bim;
    }

    public double getNota2Bim() {
        return nota2Bim;
    }

    public void setNota2Bim(double nota2Bim) {
        this.nota2Bim = nota2Bim;
    }

    public double getNota3Bim() {
        return nota3Bim;
    }

    public void setNota3Bim(double nota3Bim) {
        this.nota3Bim = nota3Bim;
    }

    public double getNota4Bim() {
        return nota4Bim;
    }

    public void setNota4Bim(double nota4Bim) {
        this.nota4Bim = nota4Bim;
    }
    
    public DisciplinaPratica getDisciplinaPratica() {
        return disciplinaPratica;
    }

    public void setDisciplinaPratica(DisciplinaPratica disciplinaPratica) {
        this.disciplinaPratica = disciplinaPratica;
    }
    
    //metodos da classe
    public double MediaDisciplinaPratica(){
        double media;
        media = (double)( this.getNota1Bim()
                + 2*this.getNota2Bim() 
                + this.getNota3Bim() 
                + 2*this.getNota4Bim() ) /6.0;
        
        return media;
    }
    public double MediaDisciplinaPadrao(){
        double media;
        media = (double)( this.getNota1Bim()
                + this.getNota2Bim() 
                + this.getNota3Bim() 
                + this.getNota4Bim() ) /4.0;
        
        return media;
    }

    @Override
    public String toString() {
        return "Matricula{" + "ano_letivo=" + ano_letivo + ", serie=" + serie + ", aluno=" + aluno + ", disciplina=" + disciplina + ", disciplinaPratica=" + disciplinaPratica + ", nota1Bim=" + nota1Bim + ", nota2Bim=" + nota2Bim + ", nota3Bim=" + nota3Bim + ", nota4Bim=" + nota4Bim + '}';
    }
    
    
    
}
