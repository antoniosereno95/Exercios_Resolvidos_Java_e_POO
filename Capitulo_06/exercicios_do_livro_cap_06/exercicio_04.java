
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[3];
        int[] vetor_posiçao = new int[3];
        int cont = -1;
        
        for(int i =0; i< vetor.length ; i++){
            vetor[i] = input.nextInt();
            if(vetor[i] == 30){
                cont++;
                vetor_posiçao[cont] = i;
            }
        }
       
        for(int j=0;j<vetor_posiçao.length;j++){
            System.out.print(vetor_posiçao[j] + " "); 
        }
        
    }    
}
