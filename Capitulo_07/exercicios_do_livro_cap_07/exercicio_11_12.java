
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_11_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] idade = new int[4]; //9
        int[] codigo = new int[3];//6
        int[][] a = new int[4][3];
        
        idade[0] = 0;
        System.out.println("digite as idades:");
        for(int i = 1 ; i<idade.length ; i++){
            idade[i] = input.nextInt();
        }
        codigo[0] = 0;
        System.out.println("digite os codigos da turma:");
        for(int i = 1 ; i<codigo.length ; i++){
            codigo[i] = input.nextInt();
        }
        for(int i = 0 ; i<a.length ; i++){
            for(int j = 0 ; j<a[i].length ; j++){
               a[i][j] = 0;
               if(j>0){
                   a[0][j] = codigo[j]; //codigos vao para as colunas.
               }
               if(i>0){
                   a[i][0] = idade[i]; //idade ficam nas linhas.
               }
            }
        }
        //imprime a matriz com os zeros.
        for(int i = 0 ; i<a.length ; i++){
            for(int j = 0 ; j<a[i].length ; j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        //pergunta a quantidade de provas que cada aluno fez.
        for(int i = 1 ; i<idade.length ; i++){
            for(int j = 1 ; j<codigo.length ; j++){
                System.out.println("o aluno "+idade[i]+" fez quantas provas da disciplina "+codigo[j]+" : ");
                a[i][j] = input.nextInt();
            }
        }
        //imprime a matriz totalmente preenchida.
        for(int i = 0 ; i<a.length ; i++){
            for(int j = 0 ; j<a[i].length ; j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        //pergunta e verifica se o codigo digitado existe.
        int codigo_pesquisa = 0, chave = 0 , local_pesquisa = 0;
        System.out.println("digite codigo da sala para pesquisa de alunos entre 18 e 25 anos que fizeram mais de duas provas: ");
       while(chave == 1){
            codigo_pesquisa = input.nextInt();
            for(int i = 1 ; i < codigo.length ; i++){
                if(codigo_pesquisa == codigo[i]){
                    chave = 0;
                    local_pesquisa = i;
                }
            }
            if(chave == 0){
                System.out.print("codigo inexistente, tente novamente.\n\n");
            }
        }
        
        //procura na sala do codigo digitado, a quantidade de alunos entre 18 e 15 anos que fizeram mais de 2 provas.
        int cont_1825 = 0;
        for(int i = 1 ; i < idade.length ; i++){
            for(int j = 1 ; j < codigo.length ; j++){
                if(a[0][local_pesquisa]>=18 && a[0][local_pesquisa]<=25){
                    if(a[i][local_pesquisa] > 2){
                        cont_1825++;
                    }
                } 
            }
        }
        System.out.print("existem "+cont_1825+" alunos na sala "+codigo_pesquisa+" que fizeram mais de duas provas.");
        
        //listagem dos alunos que fizeram menos de 3 provas em cada dissiplina.
        for(int j = 1 ; j < codigo.length ; j++){
            System.out.println("na sala "+codigo[j]+" os alunos");
            for(int i = 1 ; i < idade.length ; i++){
              if(a[i][j] <= 3){
                 System.out.print("de idade = "+idade[i]+"\n"); 
              } 
            }
            System.out.println("fizeram menos de 3 provas.");
        }
        
        //media da idade dos alunos que nao fizeram nenhuma prova.
        int soma_idade = 0, cont_idade = 0 , media_idade=0;
        for(int i = 1 ; i < idade.length ; i++){
            for(int j = 1 ; j < codigo.length ; j++){
               if(a[i][j] == 0){
                   soma_idade += a[i][0];
                   cont_idade++;
               }
            }
        }
        media_idade = soma_idade/cont_idade;
        System.out.println("a media das idades dos alunos da turma que nao fizeram nenhuma prova é: "+media_idade);
   }
}
