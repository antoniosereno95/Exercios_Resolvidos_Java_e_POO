
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double preço;
        int categoria;
        double valor_aumento = 0;
        double valor_imposto = 0;
        char situaçao;
        double novo_preço = 0;
        String classe = null ;
        
        System.out.print("preço: ");
        preço = input.nextDouble();
        System.out.print("categoria: ");
        categoria = input.nextInt();
        System.out.print("situaçao(r/n): ");
        situaçao = input.next().charAt(0);
        
        if(preço<=25){
            if(categoria ==1){
                valor_aumento =  preço*5/100;
            }else if(categoria == 2){
                valor_aumento  =  preço*8/100;
            }else if(categoria ==3){
                valor_aumento =  preço*10/100;
            } 
        }else {
            if(categoria ==1){
                valor_aumento  =  preço*12/100;
            }else if(categoria == 2){
                valor_aumento =  preço*15/100;
            }else if(categoria ==3){
                valor_aumento =  preço*18/100;
            } 
        }
        
        if(situaçao == 'r' || categoria == 2){
            valor_imposto = preço*5/100;
        }else{ valor_imposto = preço*8/100; }
        
        novo_preço = preço + valor_aumento - valor_imposto;
        
        if(novo_preço<=50){
            classe = "barato";
        }else if(novo_preço > 50 && novo_preço < 120){
            classe = "normal";
        }else if(novo_preço >= 120){
            classe = "caro";
        }
        
        System.out.println("valor do aumento: " + valor_aumento + "\n" + "valor do imposto: " + valor_imposto + "\n" + "novo preço: " + novo_preço + "\n" + "classificaçao: " + classe);
        
    }
}
