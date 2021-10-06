
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_04 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        
        if(num1>num2 && num1>num3){System.out.println(num1);
            }else if(num2>num1 && num2>num3){System.out.println(num2);
            }else if(num3>num1 && num3>num2){System.out.println(num3);
            }
    }
}
