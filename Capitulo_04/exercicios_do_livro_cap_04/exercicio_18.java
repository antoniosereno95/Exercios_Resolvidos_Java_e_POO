
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade;
        idade = input.nextInt();
        
        if(idade>=18){
            System.out.println("voce ja é maior de idade, ja pode ser preso.");
        }else System.out.println("voce é um bb, nao pode ser preso ainda heuheeu.");
        
    }
}
