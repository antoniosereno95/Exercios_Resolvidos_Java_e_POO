
package Exercicio_08;

import java.util.Scanner;
public class Main_acidentes_de_transito {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int VAR = 2;
        //contruir os estados
        Estados_br Pesquisa[];
        Pesquisa = new Estados_br[VAR];
        for(int i = 0 ; i < VAR ; i++){
            Pesquisa[i] = new Estados_br();
        }
        
        //coletar dados
        for(int i = 0 ; i < VAR ; i++){
            System.out.println("digite o nome do estado:");
            String nome = input.next();
            Pesquisa[i].setNome(nome);
            
            System.out.println("digite o numero de veicolos em circulaçao no estado:");
            int n_v = input.nextInt();
            Pesquisa[i].setNumero_veiculos(n_v);
            
            System.out.println("digite o numero de acidentes de transito que ocorreram no estado:");
            int n_a = input.nextInt();
            Pesquisa[i].setNumero_acidentes(n_a);
        }
        
        double maior_indice = Double.MIN_VALUE;
        double menor_indice = Double.MAX_VALUE;
        double aux , aux1 , aux2;
        int slot_maior = 0 , slot_menor = 0;
        for(int i = 0 ; i< VAR ; i++){
            aux1 = Pesquisa[i].getNumero_acidentes();
            aux2 = Pesquisa[i].getNumero_veiculos();
            aux = aux1/aux2;
            if(aux > maior_indice){
                maior_indice = aux;
                slot_maior = i;
            }
            if(aux < menor_indice){
                menor_indice = aux;
                slot_menor = i;
            }
        }
        System.out.println("O maior indice de acidentes de transito ocorreu no estado: "+Pesquisa[slot_maior].getNome()+", e teve valor igual a: "+maior_indice);
        System.out.println("O menor indice de acidentes de transito ocorreu no estado: "+Pesquisa[slot_menor].getNome()+", e teve valor igual a: "+menor_indice);
        
        System.out.println("Os percentuais de veiculos em cada estado:");
        double per , soma , numb_v;
        for(int i = 0 ; i < VAR ; i++){
            soma = Pesquisa[i].getSoma_veiculos();
            numb_v = Pesquisa[i].getNumero_veiculos();
            per = (numb_v * 100)/soma;
            System.out.println("Estado de "+Pesquisa[i].getNome()+" -- "+per);
        }
        
        System.out.println("As medias de acidentes em cada estado:");
        double media , somaa , numb;
        for(int i = 0 ; i < VAR ; i++){
            soma = Pesquisa[i].getSoma_acidentes();
            numb = Pesquisa[i].getNumero_acidentes();
            media = numb/soma;
            System.out.println("Estado de "+Pesquisa[i].getNome()+" -- "+media);
        }
        
    }
}
