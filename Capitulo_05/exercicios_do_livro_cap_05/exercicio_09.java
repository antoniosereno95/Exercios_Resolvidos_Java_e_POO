
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i , idade;
        double altura , peso;
        double m_idade , por;
        int q_pessoa,soma_idade=0 , cont1=0, cont2=0, cont3=0;
       
        for(i=0;i<10;i++){
            idade = input.nextInt();
            altura = input.nextDouble();
            peso = input.nextDouble();
            
            soma_idade = soma_idade + idade;
            
            if(peso>90 && altura<150){
                cont1++;
            }
            if(altura>190){
                cont2++;
                if(idade>=10 && idade <=30){
                    cont3++;
                }
            }
            
        }
        
        m_idade = soma_idade / 10;
        
        por = cont3*100/cont2;
        
        System.out.println(m_idade + " " + cont1 + " " + por);
        
    }
}
