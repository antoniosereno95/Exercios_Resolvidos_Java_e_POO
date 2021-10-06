
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_19 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int[] vetor1 = new int[3];
      int[] vetor2 = new int[3];
      int[] vetor3 = new int[3];
      
      for(int i = 0 ; i < vetor1.length ; i++){
          vetor1[i] = input.nextInt();
      }
      
      for(int i = 0 ; i < vetor2.length ; i++){
          vetor2[i] = input.nextInt();
      }
      for(int i = 0 ; i < vetor1.length ; i++){
          vetor3[i] = vetor1[i] * vetor2[i];
      }
      System.out.print("vetor 1: ");
      for(int i = 0 ; i < vetor3.length ; i++){
          System.out.print(vetor1[i]+" "); 
      }
      System.out.print("vetor 2: ");
      for(int i = 0 ; i < vetor3.length ; i++){
          System.out.print(vetor2[i]+" "); 
      }
      System.out.print("vetor 3 (resultante): ");
      for(int i = 0 ; i < vetor3.length ; i++){
          System.out.print(vetor3[i]+" "); 
      }
      
      
    }
}
