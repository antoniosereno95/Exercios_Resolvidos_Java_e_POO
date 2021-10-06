
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n , resp;
        n = input.nextInt();
        resp = f(n);
        System.out.println(resp);
    }
    public static int f(int n){
        int soma = 0;
        for(int i = (n-1) ; i >= 1 ; i--){
            if(n%i == 0){
                soma += i;
            }
        }
        
        return soma;
    }
}
