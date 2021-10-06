
package Exercicios_do_livro_cap_03;

import java.util.Scanner;
public class exercicio_15 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        double salario;
        double conta1;
        double conta2;
        double total;
        
        salario = leitor.nextDouble();
        conta1 = leitor.nextDouble();
        conta2 = leitor.nextDouble();
        
        total = salario - conta1 - conta2 - conta1*2/100 - conta2*2/100;
        System.out.println(total);
        
    }
}
