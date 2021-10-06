
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_16 {
    public static void main(String[] args){
        int numb = 2;
        int[] a = new int[numb];
        int[] vetor_x = le_vetor(a);
        
        int soma_r = soma(vetor_x); 
        System.out.println("A soma dos elementos do vetor é: "+soma_r);
    }
    public static int[] le_vetor(int[] b){
        int[] c = new int[b.length];
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < c.length ; i++){
            c[i] = input.nextInt();
        }
        return c;
    }
    public static int soma(int[] b){
        int soma = 0;
        for(int i = 0 ; i < b.length ; i++){
            soma += b[i]; 
        }
        return soma;
    }
    
}
