
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double res;
        res = f();
        System.out.println(res);
        
    }
    public static double f(){
        Scanner input = new Scanner(System.in);
        double media;
        int n, cont = 0, soma = 0;
        do{
            n = input.nextInt();
            soma += n;
            cont++;
        }while(n!=0);
        media = soma/cont;
        return media;
    }
}
