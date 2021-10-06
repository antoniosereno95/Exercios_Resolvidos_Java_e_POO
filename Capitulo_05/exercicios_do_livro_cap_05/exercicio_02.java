
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double ingresso;
        double lucro;
        double renda;
        double  i , n ;
        n = 120; // numero de ingressos.
        for(i = 5.0; i >=1.0 ; i = i - 0.5 , n = n + 26){
            
            ingresso = i;
            renda = ingresso * n;
            lucro = renda - 200;
            System.out.println("preço do ingresso: " + ingresso + "\nrenda: " + renda + "\nlucro: " + lucro + "\n\n");
        }
    }
}
