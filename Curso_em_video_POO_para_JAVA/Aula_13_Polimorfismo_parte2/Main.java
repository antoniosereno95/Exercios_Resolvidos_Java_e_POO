package Aula_13_Polimorfismo_parte2;

public class Main {
    public static void main(String args[]) {
        
        Lobo x = new Lobo();
        //x.emitirSom();
        
        Cachorro c = new Cachorro();
        c.emitirSom();
        c.setMembros(4);
        
        c.reagir("ola");
    }
}
