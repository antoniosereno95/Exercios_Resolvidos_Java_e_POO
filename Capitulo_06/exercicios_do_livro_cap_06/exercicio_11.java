
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int cont_p=-1 , cont_i=-1;
        
        for(int i = 0 ; i<vetor.length;i++){
            vetor[i] = input.nextInt();
        }
        for(int i = 0 ; i<vetor.length;i++){
            if(vetor[i]%2==0){
                cont_p++;
                pares[cont_p] = vetor[i];
            }else{
                cont_i++;
                impares[cont_i] = vetor[i];
            }
        }
        System.out.print("vetor pares: ");
        for(int i = 0 ; i<pares.length;i++){
            if(pares[i] != 0){
                System.out.print(pares[i]+ " ");
            }
        }
        System.out.print("\nvetor impares: ");
        for(int i = 0 ; i<impares.length;i++){
            if(impares[i] != 0){
                System.out.print(impares[i]+ " ");
            }
        }
        System.out.print("\n");    
        
    }
}
