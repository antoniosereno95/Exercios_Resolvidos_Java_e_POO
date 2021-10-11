
package Aula_12_Polimorfismo_parte1;

public class Ave extends Animal{
    
    protected String corDaPena;
    
    //contrutor
    public Ave(String corDaPena) {
        this.corDaPena = corDaPena;
    }
    
    //get and set
    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }
    
    //metodos da classe
    public void fazerNinho(){
        System.out.println("Fazendo ninho pra ter filhinho ehueheuhe");
    }
    
    //metodos abstratos sobrepostos de Animal
    @Override
    public void locomover() {
        System.out.println("aves voam!");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo minhocas");
    }

    @Override
    public void emitirSom() {
        System.out.println("emite som de ave.");
    }
    
}
