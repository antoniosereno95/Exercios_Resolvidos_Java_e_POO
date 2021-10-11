
package Aula_09b_pratica;

public class Pessoa {
    
    //atributos
    private String nome;
    private int idade;
    private char sexo;
    
    //contrutor
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    //metodos publicos
    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
    }
        
    
}
