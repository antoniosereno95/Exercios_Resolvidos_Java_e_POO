
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_14 {
    public static void main(String[] args){
        int numb = 5;
        int[] a = new int[numb];
        
        int[] x = le_vetor(a);
        
        int[] x_maior_0 = maior(x);
        int[] x_menor_0 = menor(x);
        
        System.out.println("os numeros maiores que 0 no vetro x sao:");
        for(int i = 0 ; i < x_maior_0.length ; i++){
            if(x_maior_0[i] != 0){
                System.out.print(x_maior_0[i] + " ");
            }
        }
        
        System.out.println("\nos numeros menores que 0 no vetro x sao:");
        for(int i = 0 ; i < x_menor_0.length ; i++){
            if(x_menor_0[i] != 0){
                System.out.print(x_menor_0[i] + " ");
            }
        }
        System.out.println("\n");
    }
    
    public static int[] le_vetor(int[] a_a){
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < a_a.length ; i++){
            a_a[i] = input.nextInt();
        }
        return a_a;
    }
    
    public static int[] maior(int[] b){
        int[] m = new int[b.length];
        
        for(int i = 0 ; i < b.length ; i++){
            if(b[i] > 0){
                m[i] = b[i];
            }
        }
        return m;
    }
    
    public static int[] menor(int[] c){
        int[] n = new int[c.length];
        
        for(int i = 0 ; i < c.length ; i++){
            if(c[i] <= 0){
                n[i] = c[i];
            }
        }
        return n;
    }
    
}
