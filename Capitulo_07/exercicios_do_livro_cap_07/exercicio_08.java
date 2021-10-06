
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int linha = 2 , coluna = 2 ;
        int[][] a = new int[linha][coluna];
        int[][] b = new int[linha][coluna];
        int[][] res_soma = new int[linha][coluna];
        int[][] res_subtraçao = new int[linha][coluna];
        
        System.out.println("matriz a:");
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("matriz b:");
        for(int i = 0 ; i < b.length ; i++){
            for(int j = 0 ; j < b[i].length ; j++){
                b[i][j] = input.nextInt();
            }
        }
        
        System.out.println("matriz a + b:");
        for(int i = 0 ; i < res_soma.length ; i++){
            for(int j = 0 ; j < res_soma[i].length ; j++){
                res_soma[i][j] = a[i][j] + b[i][j];
                System.out.print(res_soma[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        System.out.println("matriz a - b:");
        for(int i = 0 ; i < res_subtraçao.length ; i++){
            for(int j = 0 ; j < res_subtraçao[i].length ; j++){
                res_subtraçao[i][j] = a[i][j] - b[i][j];
                System.out.print(res_subtraçao[i][j]+" ");
            }
            System.out.print("\n");
        }
        
    }
}
