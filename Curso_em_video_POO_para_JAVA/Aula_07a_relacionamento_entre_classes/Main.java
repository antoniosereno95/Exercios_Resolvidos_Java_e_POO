
package Aula_07a_relacionamento_entre_classes;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        //contri a matriz de obejtos
        Lutador[] L = new Lutador[6];
        //cadastra a matriz de objetos
        /*
        //automaçao da entrada de dados que eu fiz.
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Digite as seguintes informaçoes para o cadastro do lutador:");
            System.out.println("nome:");
            String nome = input.nextLine();
            System.out.println("nacionalidade:");
            String nacionalidade = input.nextLine();
            System.out.println("idade:");
            int idade = input.nextInt();
            System.out.println("altura:");
            double altura = input.nextDouble();
            System.out.println("peso:");
            double peso = input.nextDouble();
            System.out.println("vitorias:");
            int vitorias = input.nextInt();
            System.out.println("derrotas:");
            int derrotas = input.nextInt();
            System.out.println("empates:");
            int empates = input.nextInt();
            
            L[i] = new Lutador(nome, nacionalidade, idade, altura, peso, vitorias, derrotas, empates);
        }
        */
        
        
        //###primeira aula###
        //feito somente pra testar oq estava funcionando na classe Lutador
        //infos dos lutadores
        L[0] = new Lutador("Pretty Boy", "França",31 , 1.75, 68.9, 11, 2, 1);
        L[1] = new Lutador("Putscritp", "Brasil", 29 , 1.60, 57.8, 14, 2, 3);
        L[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 88.9, 12, 2, 1);
        L[3] = new Lutador("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0, 2);
        L[4] = new Lutador("UFOcobol", "Brasil", 37, 1.70, 119.2, 5, 4, 3);
        L[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 185.7, 12, 2, 4);
        //L[3].Status();
        
        
        //### segunda aula ###
        L[0].Status();
        L[1].Status();
        //cria o objeto luta
        Luta UEC01 = new Luta();
        
        //marca a luta
        UEC01.MarcarLuta(L[0], L[1]);
        
        //lutar
        UEC01.Lutar();
        
        //mostra os status pra ver se deu tudo certo no pos luta
        L[0].Status();
        L[1].Status();
        
        
    }
}
