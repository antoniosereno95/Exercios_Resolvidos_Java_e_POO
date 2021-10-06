
package POO_cap_12.Exercicio_05;

public class Dependente extends Funcionario{
    
    protected Funcionario funcionario;
    protected String nomeDoDependente;
    
    public Dependente() {
        this.funcionario = null;
        this.nomeDoDependente = "";
    }
    
    public Funcionario getFuncionario() {
        return funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public String getNomeDoDependente() {
        return nomeDoDependente;
    }
    
    public void setNomeDoDependente(String nomeDoDependente) {
        this.nomeDoDependente = nomeDoDependente;
    }

    @Override
    public String toString() {
        return "Dependente{" + "funcionario=" + funcionario + ", nomeDoDependente=" + nomeDoDependente + '}';
    }
    
}
