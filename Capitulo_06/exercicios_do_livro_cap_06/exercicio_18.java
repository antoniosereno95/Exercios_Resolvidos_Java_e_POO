
package exercicios_do_livro_cap_06;

import java.util.Scanner;

public class exercicio_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[15];
        int maior =0, local_maior=0 , menor = 999999999 , local_menor=0;
        
        for(int i = 0;i<vetor.length ; i++){
            vetor[i] = input.nextInt();
        }
        for(int i = 0 ;i<vetor.length ; i++){
            if(vetor[i]> maior){
                maior = vetor[i];
                local_maior = i;
            }
            if(vetor[i] < menor){
                menor = vetor[i];
                local_menor = i;
            }
        }
        System.out.println("O maior numero é "+ maior +" e fica na posiçao " + local_maior+".\n)O menor numero é "+ menor+" e a posiçao dele e "+ local_menor+" .");
    }
}
