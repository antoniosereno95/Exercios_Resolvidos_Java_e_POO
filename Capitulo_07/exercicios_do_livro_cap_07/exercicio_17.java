
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] a = new int[10][10];
        int soma = 0;
        for(int i = 0 ; i<a.length; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = input.nextInt();
                if(i==j){
                    soma += a[i][j];
                }
            }
        }
        System.out.println(soma);
    }
}
