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
public class exercicio_08 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        float peso_kg;
        float peso_g;
        peso_kg = leitor.nextInt();
        peso_g = peso_kg*1000;
        System.out.println(peso_g + " gramas");
        
    }
    
}
