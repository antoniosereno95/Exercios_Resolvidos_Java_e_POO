
package POO_cap_12.Exercicio_02;

public class Pessoa {
    
    private String nome;
    private int idade;
    
    //contrutor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    //get and set
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
    
    //metodos 
    public void IdadeEmMeses(){
        int id_meses = this.getIdade()*12;
        System.out.println("A idade da pessoa "+this.getNome()+" é: "+id_meses);
        
    }
    public void IdadeEm2050(){
        int id_2050 = this.getIdade() + (2050-2021);
        System.out.println("A idade da pessoa "+this.getNome()+" sera: "+id_2050);
        
    }
    
}
