
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma=0;
        for(int i = 0; i <vetor.length ; i++){
            System.out.print("Digite o " + (i+1)+"º numero ");
            vetor[i]= input.nextInt();
            soma += vetor[i]; 
        }
        System.out.print("Os numeros digitados foram: ");
        for(int i = 0; i <vetor.length ; i++){
            System.out.print(vetor[i] +" ");
        }
        System.out.println("= " + soma);
    }
}
