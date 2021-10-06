
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        num1 = input.nextInt();
        num2 = input.nextInt();
        if(num1 < num2){
            System.out.println(num1);
        }else {System.out.println(num2);
            }
    }
}
