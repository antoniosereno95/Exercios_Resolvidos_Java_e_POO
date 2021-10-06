
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] cliente = new String[2];
        Double[] dvd = new Double[2];
        Double[] gratis =  new Double[2];
        double locaçoes = 0;
        for(int i = 0; i < cliente.length ; i++){
            System.out.print("nome do cliente "+(i+1)+" :" );
            cliente[i] = input.nextLine();
        }
        for(int i =0;i < dvd.length;i++ ){
            System.out.print("digite o numero de dvd´s locados pelo "+cliente[i]+" em 2011:");
            dvd[i]= input.nextDouble();
        }
        
        for(int i =0 ; i<gratis.length ; i++ ){
            locaçoes = (dvd[i] - dvd[i]%10) / 10;
            gratis[i] =  locaçoes ;
        }
        
        for(int i = 0 ; i < cliente.length; i++){
            System.out.print("O cliente "+cliente[i]+" que alugou "+dvd[i]+" dvd´s em 2011, tem direito a "+ gratis[i] +" locaçoes gratis este ano.\n" );
        }
    }
}
