
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade , i= 1 , cont = 0 , soma= 0;
        double media;
        while( i != 0){
            idade = input.nextInt();
            soma = soma + idade;
            cont++;
            if(idade == 0){
                i = 0;
            }
        }
        
        media = (double)soma / (double)cont;
        System.out.println(media);
        
    }
}
