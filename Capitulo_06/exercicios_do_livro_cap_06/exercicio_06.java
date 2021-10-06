
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String[]nome = new String[3];
        double[] t_vendas = new double[3];
        double[] percentual_comissao = new double[3];
        double[] valores_a_receber = new double[3];
        int i;
        double total_vendas = 0, maior_valor = 0 , menor_valor= 999999999;
        String maior_nome = null, menor_nome = null;
        
        for(i=0;i<nome.length;i++){
            System.out.println("nome " + (i+1)+": ");
            nome[i] = input.nextLine();
        }
        for(i=0;i<t_vendas.length;i++){
            System.out.println("vendas do funcionario " + (i+1)+": ");
            t_vendas[i] = input.nextDouble();
            System.out.println("comissao do funcionario " + (i+1)+": ");
            percentual_comissao[i] = input.nextDouble();
        }
        
        for(i=0;i<t_vendas.length;i++){
            valores_a_receber[i] = t_vendas[i] + t_vendas[i] * (percentual_comissao[i]/100);
        }
        
        for(i=0;i<t_vendas.length;i++){
            total_vendas += t_vendas[i];
        }
        
        for(i=0;i<valores_a_receber.length;i++){
            if(valores_a_receber[i] > maior_valor){
                maior_valor = valores_a_receber[i];
                maior_nome = nome[i];
            }
            if(valores_a_receber[i] < menor_valor){
                menor_valor = valores_a_receber[i];
                menor_nome = nome[i];
            }
        }
        System.out.print("lista dos nome e a quantia a ser recebida por cada funcionario:\n");
        for(i=0;i<nome.length;i++){
            System.out.print("nome: " + nome[i] + "--- total a receber:" + valores_a_receber[i] + "\n");
        }
        System.out.print("O maior valor de "+ maior_valor+" sera recebido por "+ maior_nome);
        System.out.print("\nO menor valor de "+menor_valor+" sera recebido por "+ menor_nome +"\n");
    }
}
