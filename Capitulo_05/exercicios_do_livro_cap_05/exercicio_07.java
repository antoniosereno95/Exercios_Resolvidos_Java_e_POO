
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade , i;
        double altura, peso;
        int cont1 = 0 , cont2 = 0 , total_p = 0 , peso_inf = 0;
        double soma_alturas = 0 , media_alturas , porcentagem;
        
        for(i=0; i<5; i++){
           idade = input.nextInt();
           altura = input.nextDouble();
           peso = input.nextDouble();
           
           if(idade != 0){
               total_p ++;
           }
           if(idade > 50){
               cont1++;
           }
           if(idade>=10 && idade <=20){
               soma_alturas = soma_alturas + altura;
               cont2++;
           }
           if(peso < 40.0){
               peso_inf++;
           }
        }
        
        media_alturas = soma_alturas / cont2;
        
        porcentagem = peso_inf*100/total_p;
                
        System.out.println("pessoas acima dos 50: " + cont1 + "\nmedia das alturas: " + media_alturas + "\n% peso inferior a 40: " + porcentagem);
        
    }
}
