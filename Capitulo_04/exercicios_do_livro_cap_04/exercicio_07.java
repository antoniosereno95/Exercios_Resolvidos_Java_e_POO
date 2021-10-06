
package exercicios_do_livro_cap_04;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double sal;
    double novosal;
    
    sal = input.nextDouble();
    
    if(sal <= 500.0){
    novosal = sal + sal*30/100 ;
    System.out.println(novosal);
    } else System.out.println("voce nao tem direito ao aumento.");

    
}
}