
package Exercicio_04;

import java.util.Scanner;
public class Pesquisa_hab {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int VAR = 3;
        //contruir os 20 individuos.
        Registro_hab pesquisa[];
        pesquisa = new Registro_hab[VAR];
        for(int i = 0 ; i < VAR ; i++){
            pesquisa[i] = new Registro_hab();
        }
        
        int mulher_2filhos_menos_600 = 0;
        //coletar dados.
        for(int k=0 ; k<VAR ; k++){
            System.out.println("digite a idade da pessoa "+(k+1)+": ");
            int id = input.nextInt();
            while(id<0){
                System.out.println("erro, tente novamente");
                id = input.nextInt();
            }
            pesquisa[k].setIdade(id);
            
            char s;
            int chave = 0;
            do{
                System.out.println("digite sexo da pessoa "+(k+1)+":(M/H) ");
                s = input.next().charAt(0);
                if(s == 'M' || s == 'H'){
                     chave = 2;
                }else{
                    System.out.println("erro,tente novamente");
                    chave = 1;
                }
            }while(chave == 1);
            pesquisa[k].setSexo(s);
            
            System.out.println("digite a renda familiar da pessoa "+(k+1)+": ");
            double renda = input.nextDouble();
            while(renda<0){
                System.out.println("erro, tente novamente");
                renda = input.nextDouble();
            }
            pesquisa[k].setRenda_familiar(renda);
            
            System.out.println("digite o numero de filhos da pessoa "+(k+1)+": ");
            int fi = input.nextInt();
            while(fi<0){
                System.out.println("erro, tente novamente");
                fi = input.nextInt();
            }
            pesquisa[k].setNumero_filhos(fi);
            
            if(s == 'M' && renda <600){
                mulher_2filhos_menos_600++;
            }
        }
        
        double media_salarial, soma_sal;
        soma_sal = Registro_hab.soma_renda;
        media_salarial = soma_sal / VAR;
        System.out.println("A media salarial do grupo da pesquisa é de: "+media_salarial);
        
        System.out.println("A maior idade do grupo da pesquisa foi de: "+Registro_hab.maior_idade);
        System.out.println("A menor idade do grupo de pesquisa foi de: "+Registro_hab.menor_idade);
        
        System.out.println("A quantidade de mulheres com dois filhos e que tem renda familiar a baixo de 600 reias foi de: "+mulher_2filhos_menos_600);
        
    }    
}
