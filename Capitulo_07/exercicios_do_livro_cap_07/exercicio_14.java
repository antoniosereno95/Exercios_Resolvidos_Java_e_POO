
package exercicios_do_livro_cap_07;

import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int linha = 2 , coluna = 3;
        int[][] a = new int[linha][coluna];
        int[] v = new int[linha*coluna];
        int k = -1;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = input.nextInt();
                if(a[i][j] >=5 && a[i][j] <= 15){
                    k++;
                    v[k] = a[i][j];
                }
            }
        }
        System.out.print("\n");
        for(k=0; k< v.length ; k++){
            if(v[k]!= 0){
                System.out.print(v[k]+" ");
            }
        }
    }
}
