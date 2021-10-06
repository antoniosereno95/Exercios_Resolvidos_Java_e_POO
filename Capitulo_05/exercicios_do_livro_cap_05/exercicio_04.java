
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero , i, conta;
        numero = input.nextInt();
        for(i = 0; i<=10; i++){
            conta = numero * i;
            System.out.print(numero + " X " + i + " = " + conta + ".\n");
        }
    }
}
