
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double preço;
        double novo=0;
        double desconto=0;
        
        preço = input.nextDouble();
        
        if(preço <= 30){
            novo = preço;
            desconto = 0;
        }else if(preço > 30 && preço <= 100){
            novo = preço - preço*10/100;
            desconto = preço*10/100;
        }else if(preço > 100 ){
            novo = preço - preço*15/100;
            desconto = preço*15/100;
        }
        System.out.println(novo + "\n" + desconto);
    }
}
