
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int linha = 6 , coluna = 4;
        int[][] a = new int[linha][coluna];
        int[][] b = new int[coluna][linha];
        int[] a_linha = new int[linha];
        int[] b_coluna = new int[linha];
        int soma = 0;
        System.out.println("matriz a:");
        for(int i = 0 ; i < a.length ; i++){
            for(int j =0 ; j < a[i].length ; j++){
                a[i][j] = input.nextInt();
                a_linha[i] += a[i][j]; 
            }
        }
        System.out.print ("a_linha: ");
        for(int i = 0 ; i < a_linha.length ; i++){
            System.out.print (a_linha[i]+" ");
        }
        System.out.print("\n");
        System.out.println("matriz b:");
        for(int i = 0 ; i < b.length ; i++){
            for(int j =0 ; j < b[i].length ; j++){
                b[i][j] = input.nextInt();
                b_coluna[j] += b[i][j];
            }
        }
        System.out.print ("b_coluna: ");
        for(int i = 0 ; i < b_coluna.length ; i++){
            System.out.print (b_coluna[i]+" ");
        }
        System.out.print("\n");
        
        System.out.print ("a soma de a_linha e b_linha é: ");
        for(int i = 0 ; i < b_coluna.length ; i++){
            soma += a_linha[i] + b_coluna[i];
        }
        System.out.print(soma+"\n");
        
        
    }
}
