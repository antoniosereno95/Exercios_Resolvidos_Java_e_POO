
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);    
        int[] vetor = new int[6];
        int[] pares = new int[6];
        int[] impares = new int[6];
        int i ,contpares = -1 , contimpares = -1;
        
        for(i = 0; i < vetor.length ; i++){
            vetor[i] = input.nextInt();
            if(vetor[i]%2 == 0){
                contpares++;
                pares[contpares] = vetor[i];
            }else{
                contimpares++;
                impares[contimpares] = vetor[i];
            }
        }
        System.out.print("os "+(contpares+1) + " numeros de pares sao: ");
        for(i=0 ; i < pares.length ; i++ ){
            if(pares[i]!= 0){
            System.out.print(pares[i] + " ");
            }
        }    
        System.out.print("\nos "+(contimpares+1)+" numeros de impares sao: ");
        for(i=0 ; i < impares.length ; i++ ){
            if(impares[i]!= 0){
            System.out.print(impares[i] + " ");
            }
        }    
        System.out.println("\n");
    }
}
