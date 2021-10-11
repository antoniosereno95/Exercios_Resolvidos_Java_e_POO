
package Aula_11_herança_parte2;

public abstract class Pessoa {
    /*'protected' é usado quando se quer proteger 
    a variavel de classe nao-filhas e de outros .JAVA,
    ela da acesso a variavel pela Classe progenitora(superclasse)
    e tbm da acesso a variavel para as classes filhas(subclasses)
    que tbm tem o direito de mudar a variavel, com uma variavel 
    do tipo private somente quem tem acesso e tbm permissao para
    mudar o valor da variavel é a classe onde a variavel esta 
    declarada ou pelos metodos da classe ou interface que contrala 
    a classe dona da variavel.
    */
    protected String nome;
    protected int idade;
    protected char sexo;
    
    
    //metodos
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
    
    //construtor
    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.sexo = ' ';
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
    
}
