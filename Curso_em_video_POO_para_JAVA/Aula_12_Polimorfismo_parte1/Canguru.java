
package Aula_12_Polimorfismo_parte1;

public class Canguru extends Mamifero {
    
    public void usarBolsa(){
        System.out.println("usando bolsa");
    }
    
    @Override
    public void locomover(){
        System.out.println("Cancuru Salta");
    }
    
}
