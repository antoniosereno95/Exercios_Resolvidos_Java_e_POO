
package Exercicio_01_refazer;

import java.util.Scanner;
public class teste_banco_de_dados {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Cadastro vendedores[][];
        vendedores = new Cadastro[2][2];
        //contruir cada cadastro um por um.
        for(int i = 0; i < 2 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                vendedores[i][j] = new Cadastro();
            }
        }
        
        int codigo = 0;
        for(int i = 0; i < 2 ; i++){
            System.out.println("digite o codigo "+i+":");
            codigo = input.nextInt();
            for(int j = 0 ; j < 2 ; j++){
                vendedores[i][j].codigo_vendedor = codigo;
            }
        }
        
        System.out.println("veja se deu certo o codigo");
        int printa =0;
        for(int i = 0; i < 2 ; i++){
            System.out.println("");
            for(int j = 0 ; j < 2 ; j++){
                printa = vendedores[i][j].getCodigo();
                System.out.print(printa+" ");
            }
        }
        
        double venda = 0;
        for(int i = 0; i < 2 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                System.out.println("digite a venda "+j+" :");
                venda = input.nextDouble();
                vendedores[i][j].venda = venda;
            }
        }
        
        double printa_cod ,printa1 , printa2;
        for(int i = 0; i < 2 ; i++){
            System.out.println("");
            for(int j = 0 ; j < 2 ; j++){
                printa_cod = vendedores[i][j].getCodigo();
                printa1 = vendedores[i][0].getVenda();
                printa2 = vendedores[i][1].getVenda();
                System.out.print(printa_cod+" "+printa1+" "+printa2+" ");
            }
        }
        
    }
}
