
package exercicios_do_livro_cap_06;

import java.util.Scanner;

public class exercicio_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetor1 = new int[3];
        int[] vetor2 = new int[3];
        for(int i=0 ; i < vetor1.length;i++){
            vetor1[i] = input.nextInt();
        }
        for(int i=0 ; i < vetor1.length;i++){
            vetor2[i] = vetor1[i];
            if(vetor2[i] == 0){
                vetor2[i] = 1;
            }
        }
        System.out.print("vetor 1\n");
        for(int i=0 ; i < vetor1.length;i++){
            System.out.print(vetor1[i]+" ");
        }
        System.out.print("\nvetor 2\n");
        for(int i=0 ; i < vetor1.length;i++){
            System.out.print(vetor2[i]+" ");
        }
    }
}
