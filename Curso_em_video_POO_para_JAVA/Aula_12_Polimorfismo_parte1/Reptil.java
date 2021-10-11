
package Aula_12_Polimorfismo_parte1;

public class Reptil extends Animal{
    
    protected String corDaEscama;
    
    //construtor

    public Reptil() {
        this.corDaEscama = "";
    }
    
    //get and set

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }

    //sobrescrevendo os metodos abstratos da classe Animal
    @Override
    public void locomover() {
        System.out.println("reptil rasteja");
    }

    @Override
    public void alimentar() {
        System.out.println("reptil come vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("emite som de reptil");
    }
    
}
