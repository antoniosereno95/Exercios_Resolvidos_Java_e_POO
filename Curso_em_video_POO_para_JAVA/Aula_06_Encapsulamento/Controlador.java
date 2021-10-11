
package Aula_06_Encapsulamento;

public interface Controlador {
    
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
    
    //nem sempre o tipo dos metodos precisa ser void
    // mas nesse exemplo pra ficar mais facil ficou
    // tudo no void mesmo.
}
