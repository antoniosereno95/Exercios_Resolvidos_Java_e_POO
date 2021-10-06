
package Exercicios_do_livro_cap_03;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args){
        
        Scanner scanf = new Scanner(System.in);
        int x;
        int y;
        int resultado;
        x = scanf.nextInt();
        y = scanf.nextInt();
        
        resultado = x - y;
        
        System.out.println( resultado );
    }
}
