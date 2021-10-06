
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] a = new int[3][3];
        int maior = 0;
        
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = input.nextInt();
                if(a[i][j] > maior  ){
                    maior = a[i][j];
                }
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                if(i == j){
                  a[i][j] =  maior * a[i][j];
                }
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
