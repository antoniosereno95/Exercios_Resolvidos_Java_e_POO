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
public class exercicio_04 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        float nota1;
        float nota2;
        float notafinal;
        nota1 = leitor.nextInt();
        nota2 = leitor.nextInt();
        
        notafinal = (nota1*2 + nota2*3) / 5;
        System.out.println(notafinal);
        
    }
}
