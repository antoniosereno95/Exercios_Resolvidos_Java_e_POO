
package exercicios_do_livro_cap_06;

import java.util.Scanner;
import java.util.Arrays;
public class exercicio_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        
        for(int i=0 ; i < a.length;i++){
            a[i] = input.nextInt();
        }
        for(int i=0 ; i < b.length;i++){
            b[i] = input.nextInt();
        }
        
        int k , j , soma = 0;
        for(k=0 , j=(b.length-1) ; k < a.length ;k++ , j--){
            soma += a[k] - b[j];
            System.out.println(soma); 
        }
        System.out.println("\nsoma: " + soma);
    }
}
