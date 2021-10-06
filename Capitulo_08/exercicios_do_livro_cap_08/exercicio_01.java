
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numb;
        numb = input.nextInt();
        int resultado;
        
        resultado = f(numb);
        
        System.out.println(resultado);
    }
    
    public static int f(int n){
        int soma = 0;
        for(int i = 1 ; i <= n ; i++){
           soma += i; 
       }
        return soma;
    }
    
    
}
