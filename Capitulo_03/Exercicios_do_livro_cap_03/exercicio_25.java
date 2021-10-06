
package Exercicios_do_livro_cap_03;

import java.util.Scanner;

public class exercicio_25 {

        public static void main(String[] args){
            Scanner leitor = new Scanner(System.in);
            
            double dinheiro; 
            double dollar;
            double marco;
            double libra;
            
            dinheiro = leitor.nextDouble();
            
            dollar = dinheiro/1.8;
            marco = dinheiro/2;
            libra = dinheiro/3.57;
            
            System.out.println(dollar + "\n" + marco + "\n" + libra + "\n" );
            
            
        }
}
