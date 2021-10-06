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
public class exercicio_07 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        float peso;
        float peso_mais;
        float peso_menos;
        peso = leitor.nextInt();
        peso_mais = peso + peso*15/100;
        peso_menos = peso - peso*20/100;
        
        System.out.println(peso_mais + "\n" + peso_menos);
        
    }
}
