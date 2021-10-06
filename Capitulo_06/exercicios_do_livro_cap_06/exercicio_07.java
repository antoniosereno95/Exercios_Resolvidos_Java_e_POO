
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int cont = 0 , soma = 0;
        for(int i=0;i<vetor.length;i++){
            vetor[i] = input.nextInt();
            if(vetor[i] < 0){
                cont++;
            }else{
                soma += vetor[i];
            }
        }
        System.out.println("numb negativos = " +cont + "\nsoma dos positivos = " + soma);
    }
}
