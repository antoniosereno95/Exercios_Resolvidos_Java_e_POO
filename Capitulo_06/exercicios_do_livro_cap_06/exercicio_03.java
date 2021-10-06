
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetor_produto = new int[3];
        int[] vetor_quantidade = new int[3];
        int codigo_do_cliente , i , j ;
        int produto , quantidade;
        int chave1 = 0, local_da_quantidade = 20;
        
        for(i=0 , j =0 ; i<vetor_produto.length ; i++ , j++){
            System.out.print("codigo do produto: ");
            vetor_produto[i]= input.nextInt();
            System.out.print("quantidade em estoque do produto " + vetor_produto[i] + ": " );
            vetor_quantidade[j] = input.nextInt();
        }
        
        codigo_do_cliente = 1;
        while(codigo_do_cliente != 0){
            System.out.print("codigo do cliente: ");
            codigo_do_cliente = input.nextInt();
            if(codigo_do_cliente !=0){
                System.out.print("qual produto vc procura? ");
                produto = input.nextInt();
                for(i=0;i<vetor_produto.length;i++){
                    if(vetor_produto[i] == produto){
                        chave1 = 1;
                        local_da_quantidade = i;
                    }
                }
                if(chave1 == 1){
                    System.out.print("qual quantidade do produto vc deseja? ");
                    quantidade = input.nextInt();
                    if(quantidade <= vetor_quantidade[local_da_quantidade]){
                        vetor_quantidade[local_da_quantidade] = vetor_quantidade[local_da_quantidade] - quantidade;
                        System.out.print("pedido atendido, volte sempre.\n");
                    }else{
                        System.out.print("estoque insuficiente.\n");
                    }
                }else {
                    System.out.print("produto not found.");
                }
            } 
        }
        
        for(i=0 , j =0 ; i<vetor_produto.length ; i++ , j++){
            System.out.print("o produto de codigo: ");
            System.out.print(vetor_produto[i]);
            System.out.print(" aprensenta uma quantidade de estoque de: ");
            System.out.print(vetor_quantidade[j] + ".\n");
        }
        
    }    
}
