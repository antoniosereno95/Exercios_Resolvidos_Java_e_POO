
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int linha = 2 , coluna = 3;
        int[][] a = new int[linha][coluna];
        int[][] b = new int[linha][coluna];
        int[] vetor = new int[coluna];
        
        for(int i = 0 ; i <a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = input. nextInt();
                vetor[j] += a[i][j];
            }
        }
        System.out.print("matriz original:");
        for(int i = 0 ; i <a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("vetor soma:");
        for(int i = 0 ; i <vetor.length ; i++){
            System.out.print(vetor[i]+" ");
        }
        System.out.print("\n");
        
        for(int i = 0 ; i <b.length ; i++){
            for(int j = 0 ; j < b[i].length ; j++){
                b[i][j] = vetor[j] * a[i][j];
            }
        }
        System.out.println("Matriz resultante:");
        for(int i = 0 ; i <b.length ; i++){
            for(int j = 0 ; j < b[i].length ; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
