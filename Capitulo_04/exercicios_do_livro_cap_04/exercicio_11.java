
package exercicios_do_livro_cap_04;

import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double salario;
    double novo = 0;
    double aumento = 0;
    salario = input.nextDouble();
    
    if(salario <= 300.0){
        aumento = 15*salario/100;
        novo = salario + 15*salario/100;
    }else if(salario > 300.0 && salario < 600.0){
            aumento = 10*salario/100;
            novo = salario + 10*salario/100;
    }else if(salario >=600.0 && salario <= 900.0 ){
        aumento = 5*salario/100;
            novo = salario + 5*salario/100;
    }else if(salario > 900.0){
        aumento = 0;
            novo = salario;
    }
    System.out.println(aumento + "  " + novo);
    
    }
}
