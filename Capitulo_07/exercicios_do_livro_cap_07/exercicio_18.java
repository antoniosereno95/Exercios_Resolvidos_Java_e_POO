
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] a = new int[8][6];
        int soma = 0, cont=0 , media = 0;
        
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = input.nextInt();
                if(i%2 == 0){
                    soma += a[i][j];
                    cont++;
                }
            }
        }
        media = soma/cont;
        
        System.out.print(media);
        
    }
}
