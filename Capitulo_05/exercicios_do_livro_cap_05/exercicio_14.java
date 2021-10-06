
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade , bom = 0 , otimo = 0 , regular = 0;
        int chave , i , soma_id = 0 , por;
        double media;
        for(i = 0; i<15; i++){
            idade = input.nextInt();
            chave = input.nextInt();
            soma_id = soma_id + idade;
            if(chave == 1){
                regular++;
            }else if(chave == 2){
                bom++;
            }else if(chave == 3){
                otimo++;
            }else{
                System.out.println("chave nao classificada, repita a entrada de idade e de chave por obsequio lol");
                i--;
            }
        }
        media = (double)soma_id / 15;
        por = bom * 100 / 15;
        System.out.println("media idades: " + media + "\nrespostas 'regular': " + regular + "\nporcentagem de respostas 'bom': " + por);
    }
}
