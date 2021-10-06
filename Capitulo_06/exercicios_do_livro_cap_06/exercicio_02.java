
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[7];
        int[] mult2 = new int[7];
        int[] mult3 = new int[7];
        int[] mult23 = new int[7];
        int i , cont2 = -1 , cont3 = -1 , cont23 = -1;
        
        for(i=0;i<vetor.length ; i++){
            vetor[i] = input.nextInt();
            if(vetor[i]%2 == 0){
                cont2++;
                mult2[cont2] = vetor[i];
            }
            if(vetor[i]%3 == 0){
                cont3++;
                mult3[cont3] = vetor[i];
            }
            if(vetor[i]%2 == 0 && vetor[i]%3 == 0){
                cont23++;
                mult23[cont23] = vetor[i];
            }
        }
        System.out.print("os "+(cont2+1) + " numeros mutipilos de 2 são: ");
        for(i=0 ; i < mult2.length ; i++ ){
            if(mult2[i]!= 0){
            System.out.print(mult2[i] + " ");
            }
        }
        System.out.print("\nos "+(cont3+1) + " numeros mutipilos de 3 são: ");
        for(i=0 ; i < mult3.length ; i++ ){
            if(mult3[i]!= 0){
            System.out.print(mult3[i] + " ");
            }
        }
        System.out.print("\nos "+(cont23+1) + " numeros mutipilos de 2 e 3 são: ");
        for(i=0 ; i < mult23.length ; i++ ){
            if(mult23[i]!= 0){
            System.out.print(mult23[i] + " ");
            }
        }    
        System.out.println("\n");
    }
}
