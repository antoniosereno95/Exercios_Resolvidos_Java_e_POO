
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade , i ;
        double altura, peso , soma_alturas = 0 , media , por1;
        char olho , cabelo;
        int cont1 = 0, cont2 = 0 , cont3=0, cont4 = 0;
        
        for(i=0; i<6 ; i++){
            idade = input.nextInt();
            altura = input.nextDouble();
            peso = input.nextDouble();
            olho = input.next().charAt(0);
            cabelo = input.next().charAt(0);
             if(idade>50 && peso<60){
                 cont1++;
             }
             if(altura < 150){
                 cont2++;
                 soma_alturas = soma_alturas + idade; // é soma das idades mais eu vo mudar o nome da variavel nao kakakak
             }
             if(olho =='A' || olho == 'a'){
                 cont3++;
             }
             if(cabelo == 'R' || cabelo == 'r'){
                 if(olho != 'a' || olho != 'A' ){
                        cont4++;
                    }
             }
        }
        
        media = soma_alturas/cont2;
        
        por1 = cont3*100/6;
        
        System.out.println("acima de 50 e peso inferior a 60: " + cont1 + "\nmedia das idades(<150cm): " + media + "\nporcentagem de olhos azuis: " + cont3 + "\nruivos sem olhos azuis: " + cont4);
        
        
    }
}
