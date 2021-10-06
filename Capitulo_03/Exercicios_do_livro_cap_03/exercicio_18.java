
package Exercicios_do_livro_cap_03;

import java.lang.Math;
import java.util.Scanner;

public class exercicio_18 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        double c;
        double f;
        
        c = leitor.nextInt();
        
        f = 180*(c+32)/100;
        
        System.out.println(f);
        
    }
    
}
