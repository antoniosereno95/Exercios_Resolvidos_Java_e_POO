
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_20 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int[] vetor = new int[3];
      
      for(int i = 0; i < vetor.length ; i++){
          vetor[i] = input.nextInt();
      }
      for(int i = 0; i < vetor.length ; i++){
          if(vetor[i] >= 0){
              System.out.print(vetor[i]+" ");
        }
      }
      System.out.print("\n");
    }
}  
