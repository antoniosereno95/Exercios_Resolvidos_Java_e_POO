
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n , res;
        n = input.nextInt();
        res = fat(n);
        System.out.println(res);
    }    
    public static int fat(int n){
        int fat = 1;
        for(int i = n ; i >= 1 ; i--){
            fat *= i; 
        }
        
        return fat;
    }
}
