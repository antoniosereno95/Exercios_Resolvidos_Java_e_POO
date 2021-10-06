
package Exercicios_do_livro_cap_03;

import java.lang.Math;
import java.util.Scanner;

public class exercicio_19 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double dim_1;
        double dim_2;
        double area;
        double potencia;
        
        dim_1 = leitor.nextInt();
        dim_2 = leitor.nextInt();
        
        area = dim_1 * dim_2;
        
        potencia = area/18;
        
        System.out.println(potencia);
        
    }
    
}
