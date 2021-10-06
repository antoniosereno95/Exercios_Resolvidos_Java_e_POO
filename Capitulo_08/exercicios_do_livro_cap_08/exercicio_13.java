
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_13 {
    public static void main(String[] args){
        int numb = 3;
        int[] a = new int[numb];
        char[] b = new char[numb];
        double[] c = new double[numb];
        int[] d = new int[numb];
        
        int[] idade = fidade(a); 
        char[] sexo = fsexo(b);
        double[] salario = fsalario(c);
        int[] filhos = ffilhos(d);
        
        double res_media_sal = media_salarios(salario);
        System.out.println("a media salarial do grupo é: "+res_media_sal);
        
        int maior_idade = mmaior(idade);
        System.out.println("a maior idade do grupo é: "+maior_idade);
        
        int menor_idade = mmenor(idade);
        System.out.println("a menor idade do grupo é: "+menor_idade);
        
        int quantia_m_3 = quantidade(sexo , filhos , salario);
        System.out.println("a quantida de mulheres com 3 filhos e que recebem ate 500 reais do grupo é: "+quantia_m_3);
    }

    public static int[] fidade(int[] v_idade){
        Scanner input = new Scanner(System.in);
        System.out.println("digite as idades:");
        for(int i = 0 ; i < v_idade.length ; i++){
            v_idade[i] = input.nextInt();
        }
        return v_idade;  
    }
    
    public static char[] fsexo(char[] v_sexo){
       Scanner input = new Scanner(System.in);
        System.out.println("digite os sexos:");
        for(int i = 0 ; i < v_sexo.length ; i++){
            v_sexo[i] = input.next().charAt(0);
        }
        return v_sexo; 
    }
    
    public static double[] fsalario(double[] v_salario){
        Scanner input = new Scanner(System.in);
        System.out.println("digite os salarios:");
        for(int i = 0 ; i < v_salario.length ; i++){
            v_salario[i] = input.nextDouble();
        }
        return v_salario;
    }
    
    public static int[] ffilhos(int[] v_filhos){
        Scanner input = new Scanner(System.in);
        System.out.println("digite o numero de filhos:");
        for(int i = 0 ; i < v_filhos.length ; i++){
            v_filhos[i] = input.nextInt();
        }
        return v_filhos;
    }
    
    public static double media_salarios(double[] salarios){
        double media, soma = 0;
        int cont = 0;
        for(int i = 0; i < salarios.length ; i++){
            soma += salarios[i];
            cont++;
        }
        media = soma / cont ;  
        return media;
    }
    
    public static int mmaior(int[] idades){
        int maior = 0 ;
        for(int i = 0 ; i < idades.length ; i++){
            if(idades[i] > maior){
                maior = idades[i];
            }
        }
        return maior;
    }
    
    public static int mmenor(int[] idades){
        int  menor = 999999999;
        for(int i = 0 ; i < idades.length ; i++){
            if(idades[i] < menor){
                menor = idades[i];
            }
        }
        return menor;
    }
    
    public static int quantidade(char[] sexos , int[] filhos , double[] salario){
        int quantia = 0;
        for(int i = 0; i < sexos.length ; i ++){
           if(sexos[i] == 'm'){
               if(filhos[i] == 3){
                   if(salario[i] <= 500.0){
                        quantia++;
                   }
               }
           } 
        }
        return quantia;
    }
}
