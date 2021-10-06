
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_12 {
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    double salario;
    double recebido = 0;
    
    salario = input.nextDouble();
    
    if(salario <= 350.0){
        recebido = salario + 100 - (salario + 100)*7/100;
    }else if(salario > 350.0 && salario < 600.0){
        recebido = salario + 75 - (salario + 75)*7/100;
    }else if(salario >= 600.0 && salario <= 900.0){
        recebido = salario + 50 - (salario + 50)*7/100;
    }else if(salario > 900.0){
        recebido = salario + 35 - (salario + 35)*7/100;
    }
    
    System.out.println(recebido);
    
}
}
