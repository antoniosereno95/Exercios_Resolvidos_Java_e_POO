
package Exercicios_do_livro_cap_03;

import java.util.Scanner;

public class exercicio_14 {
    
    public static void main(String[] args){
        
    
        Scanner leitor = new Scanner(System.in);
        
        int ano_nasc;
        int ano_atual;
        int idade_anos;
        int idade_meses;
        int idade_dias;
        int idade_semanas;
        
        ano_nasc = leitor.nextInt();
        ano_atual = leitor.nextInt();
        
        idade_anos = ano_atual - ano_nasc;
        idade_meses = idade_anos*12;
        idade_semanas = idade_anos*12*4;
        idade_dias = idade_anos*12*4*30;
        
        System.out.println(idade_anos + "\n" + idade_meses + "\n" + idade_semanas + "\n" + idade_dias + "\n");
    }
}
