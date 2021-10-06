
package exercicios_do_livro_cap_06;

import java.util.Scanner;
import java.util.Arrays;
public class exercicio_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[20];
        
        for(int i = 0 ; i < vetor1.length ; i++){
            vetor1[i] = input.nextInt();
        }
        for(int i = 0 ; i < vetor2.length ; i++){
            vetor2[i] = input.nextInt();
        }
        
        for(int i = 0 ; i < 10 ; i++){
            vetor3[i] = vetor1[i];
        }
        int j;
        
        for(int i = 10 ; i < 20; i++){
            j = i - 10;
            vetor3[i] = vetor2[j];
        }
        //printa a array do jeito que ta. 
        for(int i = 0 ; i < vetor3.length ; i++){
            System.out.print(vetor3[i]+" "); 
        }
        
        
        
        //fazer um algoritimo bubble sort ou simplismente usar a funçao que usar abaixo.
        
        
        
        
        
        // usa a funçao Arrays.sort() para colocar a arry em ordem crescente.
        Arrays.sort(vetor3);
        for(int i = 0 ; i < vetor3.length ; i++){
            System.out.print(vetor3[i]+" "); 
        }
    }
}
