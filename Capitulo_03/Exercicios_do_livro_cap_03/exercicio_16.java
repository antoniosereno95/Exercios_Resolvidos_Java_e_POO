
package Exercicios_do_livro_cap_03;

import java.lang.Math;
import java.util.Scanner;
public class exercicio_16 {
    
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
        double cateto_adj;
        double cateto_opst;
        double hipotenusa;
       
        cateto_adj = leitor.nextInt();
        cateto_opst = leitor.nextInt();
        
        hipotenusa = Math.hypot(cateto_adj, cateto_opst);
        
        System.out.println(hipotenusa);
    }
}
