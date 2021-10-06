
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_14 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double sal;
        double novo = 0;
        
        sal = input.nextDouble();
        
        if(sal <= 300.0){
            novo = sal + sal*50/100;
        }else if(sal > 300.0 && sal <=500.0){
            novo = sal + sal*40/100;
        }else if(sal > 500.0 && sal <=700.0){
            novo = sal + sal*30/100;
        }else if(sal >700.0 && sal <=800.0){
            novo= sal + sal*20/100;
        }else if(sal > 800.0 && sal<=1000.0){
            novo = sal + sal*10/100;
        }else if (sal > 1000.0){
            novo = sal + sal*5/100;
        }
        System.out.println(novo);
    }
}
