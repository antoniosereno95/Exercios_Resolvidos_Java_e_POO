
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        double resp;
        do{
           n = input.nextInt();
        }while(n<1);
        resp = f(n);
        System.out.println(resp);
    }
    public static double f(int n){
        double soma = 0;
        for(double i = 1 ; i <= n ; i++){
           soma += (i*i+1)/(i+3);
        }
        
        return soma;
    }

}
