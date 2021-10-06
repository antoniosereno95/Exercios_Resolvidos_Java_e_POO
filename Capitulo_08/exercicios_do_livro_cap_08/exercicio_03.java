
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n , m , resultado;
        n = input.nextInt();
        m = input.nextInt();
        
        if(n>=m){
        resultado = f(n,m);
        System.out.println(resultado);
        }else{
           System.out.println("ERRO:o primeiro numero deve ser maior ou igual ao segundo numero. REICIE O PROGRAMA."); 
        }
          
    }
    
    public static int f(int n , int m){
        int k;
        
        if(n%m == 0){
            k = 0;
        }else{
          int i = m , b;  
          do{
            i++; 
            b = n%i; 
          }while(b!=0);
           k = i; 
        }
        
        return k;
    }
}
