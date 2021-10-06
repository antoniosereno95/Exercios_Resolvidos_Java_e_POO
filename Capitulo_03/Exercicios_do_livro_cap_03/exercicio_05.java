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
public class exercicio_05 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        float preço;
        float P_desc;
        preço = leitor.nextInt();
        
        P_desc = preço - preço*10/100;
        System.out.println(P_desc);
        
    }
}
