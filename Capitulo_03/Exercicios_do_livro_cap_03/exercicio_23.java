
package Exercicios_do_livro_cap_03;

import java.util.Scanner;

public class exercicio_23 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        double angulo1;
        double angulo2;
        double angulo;
        
        angulo1 = leitor.nextDouble();
        angulo2 = leitor.nextDouble();
        
        angulo = 180 - angulo1 - angulo2;
        System.out.println(angulo);
        
    }
}
