
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n , res;
        String a = "positivo";
        String b = "negativo";
        n = input.nextInt();
        res = f(n);
        if(res == 1){
            System.out.println(a);
        }else if(res == 2){
            System.out.println(b);
        }
    }
    public static int f(int n){
        int k;
        if(n%2==0){
            k = 1;
        }else{
            k = 2;
        }
        return k;
    }
}
