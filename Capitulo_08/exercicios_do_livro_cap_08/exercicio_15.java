
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_15 {
    public static void main(String[] args){
        int numb = 5;
        int[] n = new int[numb];
        
        int[] x = le_vetor(n);
        
        int conta_pares = cont_pares(x);
        System.out.println("existem "+conta_pares+" numeros pares nesse vetor X.");
    }
    public static int[] le_vetor(int[] v){
        Scanner input = new Scanner(System.in);
        int[] k = new int[v.length];
        for(int i = 0 ; i < k.length ; i++){
            k[i] = input.nextInt();
        }
        return k;
    }
    public static int cont_pares(int[] c){
        int cont = 0;
        for(int i = 0 ; i < c.length ; i++){
            if( c[i]%2 == 0 ){
                cont++;
            }
        }
        return cont;
    }
}
