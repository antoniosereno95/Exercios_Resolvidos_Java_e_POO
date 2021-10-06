
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetor_p1 = new int[10];
        int[] vetor_log = new int[15];
        int[] vetor_res = new int[15];
        int i , j , cont = -1;
        
        System.out.println("alunos de logica:");
        for(i=0;i<vetor_log.length;i++){
            vetor_log[i] = input.nextInt();
        }
        
        System.out.println("alunos de programaçao 1:");
        for(i=0;i<vetor_p1.length;i++){
            vetor_p1[i] = input.nextInt();
        }
        
        for(i=0; i< vetor_log.length; i++){
            for(j=0; j < vetor_p1.length ; j++){
                if(vetor_p1[j] == vetor_log[i]){
                    cont++;
                    vetor_res[cont] = vetor_log[i];
                }
            }
        }
        
        System.out.print("os alunos que estao pagando as duas cadeiras simultaneamente sao: ");
        for(i=0;i<vetor_res.length;i++){
            if(vetor_res[i]==0){
                i++;
            }else{
                System.out.print(vetor_res[i]);
                System.out.print(" ");
            }
        }
        System.out.println("\ndesconsidere os 'zeros'. ");
        
    }
}
