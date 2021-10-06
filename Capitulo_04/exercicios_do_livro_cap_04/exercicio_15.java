
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double invest;
        double result = 0;
        int escolha;
        int i = 0;
        
        escolha = input.nextInt();
        invest = input.nextDouble();
        
        switch(escolha){
            case 1:
                System.out.println("voce escolheu a opçao POUPANÇA:");
                result = invest + invest*3/100;
                System.out.println(result);
                i = 1;
                break;
            
            case 2:
                System.out.println("voce escolheu a opçao FUNDOS DE RENDA FIXA:");
                result = invest + invest*4/100;
                System.out.println(result);
                i = 1;
                break;
            default:
                System.out.println("escolha entre a opçao 1 e 2.");
                i = 0;
                break;
        }
        
    } 
}
