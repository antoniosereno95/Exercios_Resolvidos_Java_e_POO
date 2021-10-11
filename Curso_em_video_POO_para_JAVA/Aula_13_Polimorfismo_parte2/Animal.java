
package Aula_13_Polimorfismo_parte2;

public abstract class Animal {
    protected double peso;
    protected int idade;
    protected int membros;
    
    //metodos abstratos 
    public abstract void emitirSom();
    
    //get and set

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
}
