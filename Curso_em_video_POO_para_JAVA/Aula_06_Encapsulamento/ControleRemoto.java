
package Aula_06_Encapsulamento;

public class ControleRemoto implements Controlador{
    
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //metodos especiais
    
    //contrutor
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //os get
    private int getVolume() {
        return volume;
    }
    private boolean getLigado() {
        return ligado;
    }
    private boolean getTocando() {
        return tocando;
    }
    
    //os set
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //metodos abstratos que estao na interface Controlador

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? "+this.getLigado());
        System.out.println("Esta tocando? "+this.getTocando());
        System.out.print("Volume: "+this.getVolume());
        for(int i = 0 ; i <= this.getVolume() ; i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true){ 
        // essa parte do igualdade a true nao é necessaria 
        //pois o metodo ligado é boolena e o if ja trabalha 
        //com booleans originalmente veja como fica no 
        //metodo menosVolume();
            this.setVolume( this.getVolume() + 5 );
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume( this.getVolume() - 5 );
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume()==0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando()) ){
            //note que aqui eu usei a mesma artimanha do metodo
            // maisVolume() , so que agora eu preciso que o metodo
            //tocando() seja falso , por isso eu nego o metodo.
            //seria a mesma coisa que escrever this.getTocando() == false;
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
    
}
