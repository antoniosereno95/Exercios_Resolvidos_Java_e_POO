
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade , i , total = 8;
        int cont1=0 , cont2=0 , cont3=0 , cont4=0 , cont5=0;
        double por1 , por5;
        for(i=8; i>0 ; i-- ){
            idade = input.nextInt();
            if(idade == 0){
                total --;
            }else if(idade<=15){
                cont1 ++;
            }else if(idade>=16 && idade <=30){
                cont2++;
            }else if(idade>=31 && idade <=45){
                cont3++;
            }else if(idade>=46 && idade<=60){
                cont4++;
            }else if(idade>60){
                cont5++;
            }
        }
        
        por1 = cont1 * 100/total;
        por5 = cont5 * 100/total;
        
        System.out.println("grupo 1: " + cont1 + "\n" +"grupo 2: " + cont2 + "\n" +"grupo 3: " + cont3 + "\n" +"grupo 4: " + cont4 + "\n" + "grupo 5: " + cont5 + "\n" + "prorcentagem do grupo 1: "+ por1 + "\n" + "porcentagem do grupo 5: " + por5 + "\n");
    }
}
