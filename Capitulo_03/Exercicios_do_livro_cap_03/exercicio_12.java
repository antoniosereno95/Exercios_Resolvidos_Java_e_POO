
package Exercicios_do_livro_cap_03;

import java.util.Scanner;
public class exercicio_12 {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    double salario;
    double salario_minimo;
    double resultado;
    salario = leitor.nextInt();
    salario_minimo = leitor.nextInt();
    resultado = salario / salario_minimo;
    System.out.println(resultado);
    System.out.printf("%.1f \n", (resultado)); 
    }
}