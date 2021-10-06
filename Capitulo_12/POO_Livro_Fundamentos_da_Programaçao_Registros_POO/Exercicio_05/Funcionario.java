
package POO_cap_12.Exercicio_05;

import java.util.logging.Logger;

public class Funcionario {
    
    protected String nome;
    protected String cargo;
    protected double salario;
    protected int codigo;
    protected int numero_de_dependentes;

    public Funcionario() {
        this.nome = "";
        this.cargo = "";
        this.salario = 0.0;
        this.codigo = 0;
        this.numero_de_dependentes = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumero_de_dependentes() {
        return numero_de_dependentes;
    }

    public void setNumero_de_dependentes(int numero_de_dependentes) {
        this.numero_de_dependentes = numero_de_dependentes;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + ", codigo=" + codigo + ", numero_de_dependentes=" + numero_de_dependentes + '}';
    }
    
}
