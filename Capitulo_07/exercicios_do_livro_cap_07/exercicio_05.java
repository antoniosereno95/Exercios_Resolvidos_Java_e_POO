
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int mes = 2, semana = 4;
        double[][] a = new double[mes][semana];
        double[] vendas_mes = new double[mes];
        double[] vendas_semana = new double[semana];
        double total_vendas = 0;
        
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = input.nextDouble();
                total_vendas += a[i][j];
            }
        }
        
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                 vendas_mes[i] += a[i][j];
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                 vendas_semana[j] = a[i][j];
            }
        }
        
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        
        for(int i = 0 ; i < vendas_mes.length ; i++){
            System.out.print("as vendas do mes "+(i+1)+" foram:");
            System.out.print(vendas_mes[i]+". ");
        }
        System.out.print("\n");
        for(int i = 0 ; i < vendas_semana.length ; i++){
            System.out.print("as vendas da semana "+(i+1)+" foram:");
            System.out.print(vendas_semana[i]+". ");
        }
        System.out.print("\n");
        System.out.println("o tatal de vendas no ano foi de: "+total_vendas);
        
    }
}
