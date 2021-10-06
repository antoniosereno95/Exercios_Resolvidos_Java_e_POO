
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade ,id_menorsal = 0;
        char sexo , sexo_menorsal;
        sexo_menorsal = '!';
        double salario , soma_sal = 0 , menor_sal = 1000000000 , media_salarial;
        int contpessoa = 0 , maior_idade = 0 , menor_idade = 100 , cont_mulher_200=0;
        idade = 1;
        while(idade > 0){
            idade = input.nextInt();
            if(idade > 0){
                sexo = input.next().charAt(0);
                salario = input.nextDouble();
                contpessoa++;
                soma_sal = soma_sal + salario;
                
                if(idade > maior_idade){
                    maior_idade = idade;
                }
                if(idade < menor_idade){
                    menor_idade = idade;
                }
                
                if(sexo == 'm' || sexo == 'M'){
                    if(salario <= 200.0){
                        cont_mulher_200++;
                    }
                }
                
                if(salario < menor_sal){
                    id_menorsal = idade;
                    sexo_menorsal = sexo;
                    menor_sal = salario;
                }
            }
        }
        
            media_salarial = soma_sal / contpessoa;
            
            System.out.println("media salarial: " + media_salarial + "\nmaior idade: " + maior_idade + "\nmenor idade: " + menor_idade + "\nquantidade de mulheres com salario ate 200 reais: " + cont_mulher_200 + "\nidade e sexo da pessoa com o menor salario: " + id_menorsal + "  " + sexo_menorsal );
    }
}
