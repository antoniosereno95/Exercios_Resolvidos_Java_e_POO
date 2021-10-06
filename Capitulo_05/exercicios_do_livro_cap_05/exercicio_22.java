
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double altura , soma=0 , media;
        int idade=1 , i=0;
        
        while(idade>0){
            idade = input.nextInt();
            if(idade>0){
                altura = input.nextInt();
                if(idade>50){
                soma = soma + altura;
                i++;
                }
            }
        }
        media = soma / i;
        System.out.println(media);
    }
}
