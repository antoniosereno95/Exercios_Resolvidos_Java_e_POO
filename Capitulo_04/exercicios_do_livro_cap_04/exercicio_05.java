
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int escolha;
        int num1;
        int num2;
        
        escolha = input.nextInt();
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        switch(escolha){
        case 1:  
            int media;
            media = (num1 +num2)/2;
            System.out.println(media);
            break;
            
        case 2: 
            int maior;
            int menor;
            if(num1 > num2){
            maior = num1;
            menor = num2;
            }else {
            maior = num2;
            menor = num1;
                }
            System.out.println(maior - menor);
            break;
            
        case 3:
            int produto;
            produto = num1*num2;
            System.out.println(produto);
            break;
            
        case 4:
            double divisao;
            divisao =(double)num1/(double)num2;
            System.out.println(divisao);
            
        default:
            System.out.println("Digite SOMENTE números entre 1 e 4 na linha de comando da escolha do usuario");
            break;
    }
        
    }
}
