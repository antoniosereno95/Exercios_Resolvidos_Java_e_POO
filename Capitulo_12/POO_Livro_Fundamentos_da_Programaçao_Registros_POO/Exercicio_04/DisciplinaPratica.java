
package POO_cap_12.Exercicio_04;

public class DisciplinaPratica extends Disciplina{
    
    protected int carga_horaria_pratica;
    
    //construtor
    public DisciplinaPratica() {
        this.carga_horaria_pratica = 0;
    }
    
    //setters and getters
    public int getCarga_horaria_pratica() {
        return carga_horaria_pratica;
    }

    public void setCarga_horaria_pratica(int carga_horaria_pratica) {
        this.carga_horaria_pratica = carga_horaria_pratica;
    }
    
    
    //metodos
    @Override
    public String toString() {
        return "DisciplinaPratica{"+ "carga_horaria_pratica=" + carga_horaria_pratica + '}';
    }

    
}
