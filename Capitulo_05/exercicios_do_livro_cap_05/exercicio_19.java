
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char açao;
        double preço_compra , preço_venda;
        long lucro= 0 , soma_lucro = 0;
        int cont1000 = 0, cont200 = 0;
        
        açao = '!';
        while(açao != 'F'){
            açao = input.next().charAt(0);
            if(açao !='F'){
                preço_compra = input.nextDouble();
                preço_venda = input.nextDouble();
                lucro = (long) (preço_venda - preço_compra);
                soma_lucro = soma_lucro + lucro;
                if(lucro>1000.0){
                    cont1000++;
                }
                if(lucro<200.0){
                    cont200++;
                }
                System.out.println("lucro da açao comercializada: " + lucro );
            }
        }
        System.out.println("açoes com lucro >1000: " + cont1000 + "\naçoes com lucro <200: " + cont200 + "\nlucro total da empresa: " + soma_lucro);
 }
}