/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_do_livro_cap_03;
import java.util.Scanner;
/**
 *
 * @author anton
 */
public class exercicio_06 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        float salario_fixo;
        float comissoes;
        float vendas;
        float salario;
        
        salario_fixo = leitor.nextInt();
        vendas = leitor.nextInt();
        comissoes = vendas*4/100;
        salario = comissoes + salario_fixo;
        
        System.out.println(salario);
      
    }
}
