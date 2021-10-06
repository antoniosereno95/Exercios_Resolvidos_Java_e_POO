
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] nome = new String[5];
        Double[] preço = new Double[5];
        int cont_inf_50 = 0 , soma=0 , cont_sup_100 = 0 ;
        String[] prod = new String[5];
        double media = 0;
        int j = 0;
        for(int i =0 ; i < nome.length ; i++){
            System.out.print("digite o nome do produto "+ (i+1)+ " :");
            nome[i] = input.nextLine();
        }
        
        for(int i = 0; i< nome.length ; i++){
            System.out.print("digite o preço do "+ nome[i] + " :");
            preço[i] = input.nextDouble();
            if(preço[i] < 50.0){
                cont_inf_50++;
            }else if(preço[i] > 100){
                soma += preço[i];
                cont_sup_100++;
            }
        }
        for(int i = 0 ; i< preço.length ; i++){
            if(preço[i]>=50.0 && preço[i]<100.0){
                prod[j] = nome[i];
                if(j!=4){
                    j++;
                }
            }
        }
        
        System.out.println("a quantidade de produtos com preço inferior a 50 eh igual a: " + cont_inf_50);
        
            System.out.print("os produtos ");
            for(int i = 0; i< prod.length ; i++){
            if(prod[i] != null){
            System.out.print(prod[i]+" ");
                }
            }
        
        System.out.println("tem preço entre 50 e 100 reais.");
        if(soma != 0 && cont_sup_100 != 0){    
        media = soma / cont_sup_100;
        }
        System.out.println("A media dos produtos com valor superior a 100 é: "+media);
        
    }
}
