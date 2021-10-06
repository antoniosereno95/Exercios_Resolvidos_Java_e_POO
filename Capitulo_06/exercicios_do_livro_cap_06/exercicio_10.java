
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];
        int cont=-1,soma_vetor2=0,tamanho_soma=0,tamanho_div_impar=0;
        int impar =0 ,cont_div_impar = 0 , cont_impar2 = -1;
        
        System.out.println("vetor1:");
        for(int i = 0; i < vetor1.length ; i++){
            vetor1[i] = input.nextInt();
            if(vetor1[i]%2==0){
                tamanho_soma++;
            }else{
                tamanho_div_impar++;
            }
        }
        System.out.println("\nvetor2:");
        for(int j = 0; j < vetor2.length ; j++){
            vetor2[j] = input.nextInt();
            soma_vetor2 += vetor2[j]; 
        }
        
        int[] soma = new int[tamanho_soma];
        for(int i = 0; i < vetor1.length ; i++){
            if(vetor1[i]%2==0){
                cont++;
                soma[cont] = vetor1[i] + soma_vetor2;
            }
        }
        
        int[] div = new int[tamanho_div_impar];
        for(int i =0; i < vetor1.length ; i++){
            if(vetor1[i]%2!=0){
                 impar = vetor1[i];
                 cont_impar2++;
                 for(int j=0; j< vetor2.length ; j++){
                     if(impar % vetor2[j] == 0){
                         cont_div_impar++;
                     }
                }  
                 div[cont_impar2] = cont_div_impar;
                 cont_div_impar = 0;
            }
        }
        
        System.out.println("vetor1:");
        for(int j = 0; j < vetor1.length ; j++){
            System.out.print(vetor1[j] + " ");
        }
        System.out.println("\nvetor2:");
        for(int j = 0; j < vetor2.length ; j++){
            System.out.print(vetor2[j] + " ");
        }
        System.out.println("\nsoma:");
        for(int j = 0; j < soma.length ; j++){
            System.out.print(soma[j] + " ");
        }
        System.out.println("\ndiv impar:");
        for(int j = 0; j < div.length ; j++){
            System.out.print(div[j] + " ");
        }
        System.out.println("\n");
        
    }
}
