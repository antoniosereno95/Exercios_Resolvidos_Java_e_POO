
package Aula_10_herança_parte1;

public class Professor extends Pessoa{
    
    private String especialidade;
    private double salario;

    public Professor() {
        this.especialidade = "";
        this.salario = 0.0;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //metodos
    public void receberAumento(double aumento){
        this.setSalario(this.getSalario() + aumento);
        
    }
    
}
