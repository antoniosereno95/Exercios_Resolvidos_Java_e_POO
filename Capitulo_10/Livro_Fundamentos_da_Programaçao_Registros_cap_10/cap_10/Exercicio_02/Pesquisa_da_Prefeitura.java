
package Exercicio_02;

import java.util.Scanner;
public class Pesquisa_da_Prefeitura {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //construir 20 induviduos
        Registro_prefeitura Pesquisa[];
        Pesquisa = new Registro_prefeitura[20];
        for(int i = 0 ; i < 20 ; i++){
            Pesquisa[i] = new Registro_prefeitura();
        }
        
        //coletar informaçoes.
        for(int i = 0 ; i < 20 ; i ++){
            System.out.println("digite o salario da pessoa "+(i+1)+":");
            double sal = input.nextDouble();
            while(sal<0){
                System.out.println("salario nao pode ser negativo, tente novamente");
                sal = input.nextDouble();
            }
            Pesquisa[i].setSalario(sal);
            
            System.out.println("digite a idade da pessoa "+(i+1)+":");
            int id = input.nextInt();
            while(id<0){
                System.out.println("idades nao podem ser negativas, tente novamente.");
                id = input.nextInt();
            }  
            Pesquisa[i].setIdade(id);
            
            System.out.println("digite a quantidade de filhos da pessoa "+(i+1)+":");
            int fi = input.nextInt();
            while(fi<0){
                System.out.println("abortos nao contam como negativo, tente denovo kkk ");
                fi = input.nextInt();
            }
            Pesquisa[i].setNumero_de_Filhos(fi);
        }
        
        double soma_sal , media_sal;
        soma_sal = Registro_prefeitura.soma_sal;
        media_sal = soma_sal / 20;
        System.out.println("A media salarial do grupo é de: "+media_sal);
        
        double media_filhos , soma_filhos;
        soma_filhos = Registro_prefeitura.soma_filho;
        media_filhos = soma_filhos / 20;
        System.out.println("A media de filhos do grupo é de: "+media_filhos);
        
        double maior;
        maior = Registro_prefeitura.maior_sal;
        System.out.println("O maior salario do grupo é de: "+maior);
        
        double per , s_1000;
        s_1000 = Registro_prefeitura.sal_1000;
        per = (s_1000*100)/20;
        System.out.println("O percentual de pessoas que tem salario superior a 1000 reais é de: "+per+"%");
        
    }
}
