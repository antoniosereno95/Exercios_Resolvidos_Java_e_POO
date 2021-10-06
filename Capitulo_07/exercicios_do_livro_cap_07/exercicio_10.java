
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int linha = 5 , coluna = 5;
        int[][] a = new int[linha][coluna];
        int soma_linha4 = 0;
        int soma_coluna2 = 0;
        int soma_diagonal = 0;
        int soma_diagonal_sec = 0;
        int soma_geral = 0;
        
        for(int i = 0 ; i < a.length ; i ++){
            for(int j = 0 ; j < a[i].length ; j++){
              a[i][j] = input.nextInt();
              soma_geral += a[i][j];
              soma_linha4 += a[4][j];
              soma_coluna2 += a[i][2];
              if(i == j){
                  soma_diagonal += a[i][j]; 
              }
              if(i + j == a.length -1){
                  soma_diagonal_sec += a[i][j]; 
              }
            }
        }
        System.out.println("matriz a: "); 
         for(int i = 0 ; i < a.length ; i ++){
            for(int j = 0 ; j < a[i].length ; j++){
              System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("a soma da coluna 2: " + soma_coluna2); 
        System.out.println("a soma da linha 4: " + soma_linha4); 
        System.out.println("a soma da diagonal principal: " + soma_diagonal);
        System.out.println("a soma da diagonal principal: " + soma_diagonal_sec);
        System.out.println("a soma dos elementos da matriz: " + soma_geral);
    }  
}
