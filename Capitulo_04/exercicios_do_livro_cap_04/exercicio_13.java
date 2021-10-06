
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double preço;
        double novo_preço = 0 ;
        String tipo = " ";
        preço = input.nextDouble();
        
        if(preço <= 50.0){
            novo_preço = preço + preço*5/100;
        }else if(preço > 50.0 && preço <= 100){
            novo_preço = preço + preço*10/100;
        }else if(preço > 100){
            novo_preço = preço + preço*15/100;
        }
        
        if(novo_preço <= 80){
            tipo = new String("barato");
        }else if(novo_preço >80 && novo_preço <= 120.0 ){
            tipo = new String("normal");
        }else if(novo_preço > 120.0 && novo_preço <=200.0 ){
            tipo = new String("caro");
        }else if(novo_preço > 200.0){
            tipo = new String("muito caro");
        }
        
        System.out.println(novo_preço + " " + tipo);
    }
    
}
