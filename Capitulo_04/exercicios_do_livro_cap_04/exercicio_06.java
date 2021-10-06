
package exercicios_do_livro_cap_04;
import java.lang.Math;
import java.util.Scanner;
public class exercicio_06 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int escolha;
        double num1;
        double num2;
        
        escolha = input.nextInt();
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        
        switch(escolha){
        case 1:  
            double elev;
            elev = Math.pow(num1, num2);
            System.out.println(elev);
            break;
            
        case 2: 
            double number1;
            double number2;
            number1 = Math.sqrt(num1);
            number2 = Math.sqrt(num2);
            System.out.println(number1 +"  "+ number2);
            break;
            
        case 3:
            double numbr1;
            double numbr2;
            numbr1 = Math.cbrt(num1);
            numbr2 = Math.cbrt(num2);
            System.out.println( numbr1 + "  " + numbr2 );
            break;
            
        default:
            System.out.println("Error");
            break;
        }
    }
}
