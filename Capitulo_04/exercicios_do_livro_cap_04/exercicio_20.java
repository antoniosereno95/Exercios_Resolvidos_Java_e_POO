
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade;
        
        idade = input.nextInt();
        
        if(idade < 5){
            System.out.println("muito novo, volte quando mais velho");
        }else if(idade>=5 && idade <=7){
            System.out.println("infantil");
        }else if(idade>=8 && idade<=10){
            System.out.println("juvenil");
        }else if(idade>=11 && idade<=15){
            System.out.println("adolescente");
        }else if(idade>=16 && idade<=30){
            System.out.println("adulto");
        }else if(idade>30){
            System.out.println("senior");
        }
       
    }
}
