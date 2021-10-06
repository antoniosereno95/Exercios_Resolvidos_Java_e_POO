
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cod;
        int quatidade;
        double preço_unitario = 0;
        double preço_total = 0;
        double valor_desconto = 0;
        double preço_final = 0;
        
        cod = input.nextInt();
        quatidade = input.nextInt();
        
        if(cod>=1 && cod<=10){
            preço_unitario = 10.00;
        }else if(cod>=11 && cod<=20){
            preço_unitario = 15.00;
        }else if(cod>=21 && cod<=30){
            preço_unitario = 20.00;
        }else if(cod>=31 && cod<=40){
            preço_unitario = 30.00;
        }
        
        preço_total = preço_unitario * quatidade;
        
        if(preço_total <= 250.0){
            valor_desconto = preço_total*5/100;
            preço_final = preço_total - preço_total*5/100;
        }else if(preço_total>250.0 && preço_total <=500.0){
            valor_desconto = preço_total*10/100;
            preço_final = preço_total - preço_total*10/100;
        }else if(preço_total>500.0){
            valor_desconto = preço_total*15/100;
            preço_final = preço_total - preço_total*15/100;
        }
        System.out.println("preço unitario: " + preço_unitario + "\n" +"conta: "+ preço_total + "\n" +"valor do desconto: " + valor_desconto + "\n" + "valor a ser pago: " + preço_final );
    }
}
