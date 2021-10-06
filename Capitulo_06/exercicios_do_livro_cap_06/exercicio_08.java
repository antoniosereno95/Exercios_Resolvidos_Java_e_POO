
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double maior = 0   , p_final = 0;
        String nomes[] = new String[3];
        double[] medias = new double[3];
        int local_nome = 0;
        
        for(int i =0;i<nomes.length; i++){
            nomes[i] = input.nextLine();
        }
        for(int j=0;j<medias.length; j++){
            System.out.println("meida do aluno " + nomes[j] +":");
            medias[j] = input.nextDouble();
            if(medias[j] > maior){
                maior = medias[j];
                local_nome = j;
            }
            if(medias[j] < 7.0){
                p_final = 10 - medias[j];
                System.out.println("o aluno precisa tirar " + p_final + " na prova final prar passar de ano.");
            }
        }
        
        System.out.println("o aluno " + nomes[local_nome] +" termicou com a maior media igual a "+ maior);
    
    }
}
