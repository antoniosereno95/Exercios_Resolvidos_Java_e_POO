
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome[] = new String[10];
        int[] codigo = new int[10];
        double[] preço = new double[10];
        
        for(int i =0 ; i<nome.length ; i++){
            System.out.println("nome do produto " + (i+1) + " :");
            nome[i] = input.nextLine();
        }
        for(int j=0 ; j<codigo.length ; j++){
            System.out.print("o codigo do produto " + nome[j] + " é: ");
            codigo[j] = input.nextInt();
        }
        for(int k =0; k< preço.length;k++){
            System.out.print("o preço do produto "+ nome[k]+ " é: ");
            preço[k] = input.nextDouble();
        }
        for(int l=0; l<preço.length; l++){
            if(preço[l] > 1000 && codigo[l]%2 == 0){
                preço[l] = preço[l] + preço[l]*20/100;
            }else if(preço[l] > 1000){
                preço[l] = preço[l] + preço[l]*10/100;
            }else if(codigo[l]%2 == 0){
                preço[l] = preço[l] + preço[l]*15/100;
            }
        }
        for(int n = 0; n<nome.length ; n++){
            System.out.println("o produto " + nome[n] + " de codigo " + codigo[n] + " ficou preço igual a: " + preço[n]);
        }
        
        
    }
}
