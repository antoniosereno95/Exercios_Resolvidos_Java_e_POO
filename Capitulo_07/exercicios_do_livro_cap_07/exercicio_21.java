
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] a = new int[5][5];
        int[] v = new int[5];
        
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = input.nextInt();
                if(i == j){
                    v[i] = a[i][j];
                }
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] *= v[i];
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
