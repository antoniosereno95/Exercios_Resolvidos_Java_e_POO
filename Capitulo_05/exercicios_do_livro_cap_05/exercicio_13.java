
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade,i, cont1=0 , cont2=0 , cont3=0, cont4=0;
        double peso , peso1=0 , peso2=0, peso3=0, peso4=0;
        double media1 , media2, media3 , media4;
        for(i=0;i<15;i++){
            idade = input.nextInt();
            peso = input.nextDouble();
            if(idade<=10){
                peso1 = peso1 + peso;
                cont1++;
            }else if(idade>=11 && idade<=20){
                peso2 = peso2 + peso;
                cont2++;
            }else if(idade>=21 && idade<=30){
                peso3 = peso3 + peso;
                cont3++;
            }else if(idade>30){
                peso4 = peso4 + peso;
                cont4++;
            }
        }
        media1 = peso1/cont1;
        media2 = peso2/cont2;
        media3 = peso3/cont3;
        media4 = peso4/cont4;
        
        System.out.println(media1 + "\n" +media2 + "\n" +media3 + "\n" +media4 + "\n" );
    
    }
}
