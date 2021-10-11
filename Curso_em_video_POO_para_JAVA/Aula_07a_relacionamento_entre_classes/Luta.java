
package Aula_07a_relacionamento_entre_classes;

import java.util.Random;

public class Luta {
    //atributos
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    //getters and setters
    private Lutador getDesafiante(){
        return desafiante;
        
    }

    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    private Lutador getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    private int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean getAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //metodos publicos
    public void MarcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("###luta marcada###");
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
        
    }
    
    public void Lutar(){
        if(this.getAprovada()){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);// 0 1 2
            switch(vencedor){
                case 0://empate
                    System.out.println("Empatou a luta!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1://desafiado vence
                    System.out.println(this.desafiado.getNome()+" Ganhou a luta!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2://desafiante vence
                     System.out.println(this.desafiante.getNome()+" Ganhou a luta!");
                     this.desafiado.perderLuta();
                     this.desafiante.ganharLuta();
                     break;
            }      
            
        }else{
            System.out.println("A luta nao pode acontecer!.");
        }
    }
    
    
}
