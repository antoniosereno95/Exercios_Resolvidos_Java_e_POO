
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Menu de opçoes:\n1.Novo salario\n2.ferias\n3.Decimo terceiro\n4,Sair");
        int escolha;
        escolha = input.nextInt();
        switch(escolha){
            case 1:
                double salario, novo =0;
                salario = input.nextDouble();
                if(salario<=210.0){
                    novo = salario + salario*15/100;
                }else if(salario>210.0 && salario<=600.0){
                    novo = salario + salario*10/100;
                }else if(salario>600){
                    novo = salario + salario*5/100;
                }
                System.out.println(novo);
                break;
                
            case 2:
                double ferias;
                salario = input.nextDouble();
                ferias = salario + salario/3 ;
                System.out.println(ferias);
                break;
                
            case 3:
                int meses, i = 2;
                double decimo;
                salario = input.nextDouble();
                do{ meses = input.nextInt();
                    if(meses > 12){
                        System.out.print("entrada invalida");
                        i=0;
                    }else{i = 1;}
                }while(i == 0);
                decimo = salario*meses/12;
                System.out.println(decimo);
                break;
                
            case 4:
                break;
                
        }
    }
}
