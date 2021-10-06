
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double preço;
        char tipo;
        int i;
        double valor_total_compras = 0, valor_total_compras_avista =0;
        double valor_total_compras_parceladas =0; 
        double valor_primera_parcela_somadas =0;
        
        for(i=0;i<15;i++){
            preço = input.nextDouble();
            tipo = input.next().charAt(0);
            valor_total_compras = valor_total_compras + preço;
            if(tipo == 'v' || tipo == 'V'){
                valor_total_compras_avista = valor_total_compras_avista + preço;
            }
            if(tipo == 'p' || tipo == 'P'){
                valor_total_compras_parceladas = valor_total_compras_parceladas + preço;
                valor_primera_parcela_somadas = valor_primera_parcela_somadas + preço/3;
            }
        }
        
        System.out.println("total a visat: " + valor_total_compras_avista + "\n" + "total parcelado: " +valor_total_compras_parceladas + "\n" + "soma de totas as primeiras parcelas: " + valor_primera_parcela_somadas + "\n" + "valor acumulado de vendas: " + valor_total_compras + "\n" );
    }
}
