
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double salario;
        double novo_sal;
        salario = input.nextDouble();
        if( salario <= 300.0){
            novo_sal = salario + salario*35/100;
        }else{
        novo_sal = salario + salario*15/100;
        }
        System.out.println(novo_sal);
    }
}
