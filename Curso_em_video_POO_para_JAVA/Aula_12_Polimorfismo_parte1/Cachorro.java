
package Aula_12_Polimorfismo_parte1;

public class Cachorro extends Mamifero{

    public void enterrarOsso(){
        System.out.println("cahorros adoram enterar ossos no jardim.");
    }
    
    public void abanarRabo(){
        System.out.println("Cachorro abana o rabo pois esta feliz.");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("au! au! Au1");
    }
}
