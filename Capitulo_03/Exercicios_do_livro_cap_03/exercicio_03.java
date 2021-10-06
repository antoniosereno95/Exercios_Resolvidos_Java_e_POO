
package Exercicios_do_livro_cap_03;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
       float x;
       float y;
        x = leitor.nextInt();
        y = leitor.nextInt();
        if( y != 0){
            System.out.println( x / y);
        }
        
    }
}
