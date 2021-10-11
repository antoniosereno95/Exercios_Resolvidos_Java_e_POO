
package Aula_13_Polimorfismo_parte2;

public class Mamifero extends Animal{
    
    protected String corDoPelo;
    
    //contrutor
    public Mamifero() {
        this.corDoPelo = "";
    }
    
    //gets and sets
    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    //metodos abstratos de animal que teram de ser subrecarregados.
    @Override
    public void emitirSom() {
        System.out.println("emitindo som de mamifero");
    }
    
}

