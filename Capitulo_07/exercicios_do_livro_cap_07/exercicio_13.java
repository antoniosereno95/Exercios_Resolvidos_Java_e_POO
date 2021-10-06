
package exercicios_do_livro_cap_07;

import java.util.Scanner;
import java.util.Arrays;
public class exercicio_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int linha= 3 , coluna = 3;
        int[][] a = new int[linha][coluna];
        int[] maior = new int[linha];
        
        Arrays.fill(maior , 0);
        System.out.println("digite a matriz a:");
        for(int i = 0 ; i < a.length ; i ++){
            for(int j = 0 ; j < a[i].length ; j++){
               a[i][j] = input.nextInt();
               if(a[i][j] > maior[i]){
                   maior[i] = a[i][j];
               }
            }
        }
        for(int i = 0 ; i < a.length ; i ++){
            for(int j = 0 ; j < a[i].length ; j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i = 0 ; i < a.length ; i ++){
            System.out.print(maior[i]+" ");
        }
        
        for(int i = 0 ; i < a.length ; i ++){
            for(int j = 0 ; j < a[i].length ; j++){
               a[i][j] *=  maior[i];
            }
        }
        System.out.print("\n");
        System.out.println("matriz resultante:");
        for(int i = 0 ; i < a.length ; i ++){
            for(int j = 0 ; j < a[i].length ; j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        
    }
}
