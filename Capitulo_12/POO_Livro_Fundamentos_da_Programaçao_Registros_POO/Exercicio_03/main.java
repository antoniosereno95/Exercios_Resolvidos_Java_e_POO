
package POO_cap_12.Exercicio_03;
import java.util.Scanner;
public class main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        //contruir os objetos 
        Produto P[];
        P = new Produto[3];
        for(int i = 0 ; i < 3 ; i++){ 
            System.out.println("digite o nuemro do produto:");
            int numero_produto = input.nextInt();
            System.out.println("digite o valor do produto:");
            int valor_produto = input.nextInt();
            while(valor_produto<20 || valor_produto>350){
                System.out.println("limete de 20 a 350 para valor do produto");
                valor_produto = input.nextInt();
            }
            
            P[i] = new Produto(numero_produto,valor_produto);
        }
        
        Cliente C[];
        C = new Cliente[3];
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("digite o numero do cliente:");
            int numero = input.nextInt();
            System.out.println("digite o sexo do cliente:");
            char sexo = input.next().charAt(0);
            while(sexo!='m' && sexo!='M' && sexo!='f' && sexo!='F'){
                System.out.println("entrada invalida, tente novamente");
                sexo = input.next().charAt(0);
            }
            System.out.println("digite o nome do cliente:");
            String nome = input.next();
            
            C[i] = new Cliente(numero,nome,sexo);
        }
        
        Compra Com[];
        Com = new Compra[3]; //pra limitar o programa a 3 compras so.
        
        while(true){
            int compras = 0;
            if(compras>3){
                break;
            }
            
            System.out.println("##COMPRAS##");
            
            System.out.println("digite o numero do produto:");
            int n_produto = input.nextInt();
            boolean ok = false;
            int index_p = 4;//esse 4 aqui é de proposito pq se o index der errado no loop e o 4 aparecer na inicializaçao do objeto vai dar range out of index ERROR =);
            while(!ok){
                for(int i =0; i < 3 ; i++){
                    if(P[i].getNumero_produto() == n_produto){
                        ok = true;
                        index_p = i;
                    }
                }
                
                if(ok == false){
                        System.out.println("numero do produto nao encontrado no banco de dados, tente novamente.");
                        n_produto = input.nextInt();
                    }
            }
            
            System.out.println("digite o numero do cliente:");
            int n_cliente = input.nextInt();
            boolean ok2 = false;
            int index_c = 4;
            while(!ok2){
                for(int i =0; i < 3 ; i++){
                    if(C[i].getNumero_do_cliente() == n_cliente){
                        ok2 = true;
                        index_c = i;
                    }
                }
                
                if(ok == false){
                        System.out.println("numero do cliente nao encontrado no banco de dados, tente novamente.");
                        n_cliente = input.nextInt();
                    }
            }
            
            System.out.println("digite a quantidade do produto nesta compra:");
            int quant = input.nextInt();
            
            Com[compras] = new Compra(P[index_p],C[index_c],quant);
            
            /*
            empaquei em um problema aqui, nao consigo passar o 
            meu objeto 'numero de produto' como parametro para
            o contrutor do objeto Compra.
            
            *o contrutor la esta desta forma:
            public Compra(Produto numero_do_produto, Cliente numero_do_cliente, int quantidade) {
                this.numero_do_produto = numero_do_produto;
                this.numero_do_cliente = numero_do_cliente;
                this.quantidade = quantidade;
                this.preço_final = 0;
            }
            
            o problema é o contrutor de Compra(objeto) pede uma entrada
            que é referente ao numero do produto que esta definida dentro
            do objeto como um parametro do tipo Produto(objeto) que é
            extamente declarada dessa forma para ocorrer a comunicaçao
            entre as classes.
            */
            
            //apois declarar o novo objeto Compra so precisa chamar a funçao PrecoFinal, como abaixo.
            //double desconto = P[index_p].ValorDoDesconto();
            //boolean desconto_adicional = C[index_c].DescontoAdicional();
            
            System.out.println("valor do desconto: "+P[index_p].ValorDoDesconto());
            System.out.println("desconto adicional: "+C[index_c].DescontoAdicional());
            Com[compras].PreçoFinal();
            System.out.println("O valor final da compra é de "+Com[compras].getPreço_final());
            
            System.out.println("deseja continuar?(S/N)");
            char es = input.next().charAt(0);
            while(es!= 'S' && es!='N'){
                System.out.println("S ou N:");
                es = input.next().charAt(0);
            }
            if(es == 'N'){
                System.out.println("encerrando...");
                break;
            }else{
                System.out.println("continuando...");
            }
            
            compras++;
        }//fim da rotina
        
    }
    public static void EnunciadoDaQuestao(){
        /*
        Defina uma classe denominada PRODUTO com os seguintes atributos: número do produto e preço do produto.
        Essa classe deve possuir, também, um método para calcular o valor do desconto, ou seja, produtos com
        preço superior a R$ 100,00 possuem desconto de 15% e os demais produtos têm desconto de 5%.
        Defina uma classe CLIENTE com os seguintes atributos: número do cliente, nome do cliente e sexo do
        cliente. Essa classe deve possuir, também, um método para calcular o desconto adicional, ou seja, clientes
        do sexo feminino (F ou f) têm um desconto adicional de 5% sobre o preço do produto e os demais clientes
        (M ou m) não possuem esse desconto.
        Defina uma classe denominada COMPRA com os seguintes atributos: número do produto, número
        do cliente, quantidade e valor total. Essa classe deve possuir ainda um método para calcular o valor total,
        ou seja, a quantidade multiplicada pelo preço final. O preço final é o preço do produto menos o desconto
        adicional, quando este existe.
        Faça um programa que carregue três produtos validando apenas o preço para que este esteja entre R$
        20,00 e R$ 350,00. Carregue três clientes validando para que o sexo seja M, m, F ou f. E, por fim, carregue
        uma compra digitando um número do produto, um número do cliente e a quantidade comprada do produto
        e calculando o valor total (método da classe COMPRA). Suponha sempre a digitação de dados válidos.
        */
    }
    
}
