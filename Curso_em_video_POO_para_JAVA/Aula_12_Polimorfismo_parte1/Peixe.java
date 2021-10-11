
package Aula_12_Polimorfismo_parte1;

public class Peixe extends Animal{
    
    protected String corEscama;
    
    //contrutor
    public Peixe() {
        this.corEscama = "";
    }
    
    //get and set
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //metodos da classe
    public void soltarBolha(){
        System.out.println("soltando bolhas para respirar");
    }
    
    //metodos abstratos
    @Override
    public void locomover() {
        System.out.println("peixe nada");
    }

    @Override
    public void alimentar() {
        System.out.println("peixe come substancias e planquiton");
    }

    @Override
    public void emitirSom() {
        System.out.println("peixa nao emite som");
    }
    
}
