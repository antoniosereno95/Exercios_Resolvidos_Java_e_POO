
package Exercicios_do_livro_cap_03;

import java.util.Scanner;
public class exercicio_13 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int numero;
        numero = leitor.nextInt();
        
        System.out.println(numero + " X 0 = 0" + "     " + numero + " X 5 = " + (numero*5)+ "\n" + numero + " X 1 = " + (numero*1) + "     " + numero + " X 6 = " + (numero*6)+ "\n"+ numero + " X 2 = " + (numero*2) + "     " + numero + " X 7 = " + (numero*7) + "\n"+ numero + " X 3 = " + (numero*3) + "     " + numero + " X 8 = " + (numero*8) + "\n"+ numero + " X 4 = " + (numero*4) + "     " + numero + " X 9 = " + (numero*9) + "\n" + "              " + numero + " X 10 = " + (numero*10));
    }
}
