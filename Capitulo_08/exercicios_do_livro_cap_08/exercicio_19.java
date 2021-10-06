
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_19 {
    public static void main(String[] args){
        int numb = 5;
        int[] aux_1 = new int[numb];
        int[] aux_2 = new int[numb];
        
        System.out.println("digite os valores do vetor 1: ");
        int[] a = le_vetor_int(aux_1); 
        System.out.println("digite os valores do vetor 2: ");
        int[] b = le_vetor_int(aux_2);
        
        int[] intercecçao =  inter(a , b);
        System.out.print("\n");
        for(int i = 0 ; i < intercecçao.length ; i++){
            if(intercecçao[i] != 0){
            System.out.print(intercecçao[i]+" ");
            }
        }
        System.out.print("\n");
    }
    public static int[] le_vetor_int(int[] c){
        int[] aux = new int[c.length];
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < aux.length ; i++){
            aux[i] = input.nextInt();
        }
        return aux;
    }
    
    public static int[] inter(int[] aux , int[] aux_2){
        int[] inter = new int[aux.length];
        int k=0;
        for(int i = 0 ; i < aux.length ; i++){
            for(int j = 0 ; j < aux_2.length ; j++){
                if(aux[i] == aux_2[j]){
                    inter[k] = aux[i];
                    if(k < inter.length){
                        k++;  
                    }
                }
            }
        }
        return inter;
    }
    
}
