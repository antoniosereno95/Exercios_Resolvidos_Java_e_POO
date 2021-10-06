
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double carro;
        int i, j;
        double preço_avista ,preço;
        carro = input.nextDouble();
        preço_avista = carro - carro*20/100;
        System.out.println("pagando avista o valor final eh: "+preço_avista);
        for(i=6, j=3 ; i<=60; i = i+6 , j=j+3){
            preço = carro + carro*j/100;
            System.out.println("para "+i+" parcelas o valor final eh: "+preço);
        }
    }
}
