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
public class exercicio_09 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        float base_menor;
        float base_maior;
        float altura;
        float area;
        
        base_maior = leitor.nextInt();
        base_menor = leitor.nextInt();
        altura = leitor.nextInt();
        
        area = (base_maior + base_menor)*altura/2;
        System.out.println(area);
    }
    
}
