
package Exercicio_05;

import java.util.Scanner;
public class Estoque_papelaria {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int VAR = 1;
        
        //controi os produtos.
        Registro_de_estoque consulta[];
        consulta = new Registro_de_estoque[VAR];
        for(int i = 0 ; i < VAR ; i++){
            consulta[i] = new Registro_de_estoque();
        }
        
        //receber estoque.
        for(int i = 0 ; i < VAR ; i++){
            System.out.println("digite as informaçoes do produto que ocuparar o slot "+(i+1)+"/"+VAR+" no banco de dados:");
            System.out.println("o codigo do produto: ");
            int codigo = input.nextInt();
            while(codigo <= 0){
                System.out.println("Error, tente novamente");
                codigo = input.nextInt();
            }
            consulta[i].setCodigo(codigo);
            
            System.out.println("o valor unitario do produto: ");
            double preço = input.nextDouble();
            while(preço < 0){
                System.out.println("Error, tente novamente.");
                preço = input.nextDouble();
            }
            consulta[i].setValor_unitario(preço);
            
            System.out.println("a quantidade em estoque deste produto: ");
            int quant = input.nextInt();
            while(quant <= 0){
                System.out.println("Error, tente novamente");
                quant = input.nextInt();
            }
            consulta[i].setQuantidade_estoque(quant);
            
            System.out.println("a descriçao do produto em questao:**so uma palavra enquanto eu nao arrumo ese problema** ");
            String des = input.next();
            consulta[i].setDescriçao(des);
            
            System.out.println("Produto cadastrado!\n");
        }
        
        //rotina com menu.
        int opçao = 0;
        do{
           Menu();
           System.out.print("digite a opçao desejada: ");
           opçao = input.nextInt();
           
           if(opçao == 1){
               
               System.out.println("Digite o codigo do produto que deseja alterar a descriçao: ");
               int aux , slot = 0, achou = 0 , chave = 0 , codigo;
               do{
                    codigo = input.nextInt();
                    for(int i = 0 ; i < VAR ; i++){
                        aux = consulta[i].getCodigo();
                        if(codigo == aux){
                            slot = i;
                            achou = 0;
                            i = VAR-1;
                        }else{
                            achou = 1;
                        }
                    }
                    if(achou == 1){
                        System.out.println("erro, codigo nao encontrado, tente novamente.");
                        chave = 1;
                    }else{
                        chave = 0;
                    }
               }while(chave == 1);
               
               String des_ant = consulta[slot].getDescriçao();
               System.out.println("a descriçao atual do produto é: "+des_ant);
               
               String alt_des = "";
               System.out.println("digite a nova descriçao desejada:**so uma palavra enquanto eu nao arrumo ese problema**");
               alt_des = input.next();
               consulta[slot].setDescriçao(alt_des);
               System.out.println("descriçao alterada com sucesso para"+consulta[slot].getDescriçao()+".\n");
               
               //essa funçao esta com um problema em relaçao a .nextLine(); que nao estava funcionando 
               //ai eu tive que jogar o .next(); mesmo pra poder pelomenos o programa ler uma palavra 
               //na descriçao invez de simplismente nao pegar nada como antes.
           }else if(opçao == 2){
               
               System.out.println("Digite o codigo do produto que deseja alterar o valor unitario: ");
               int aux , slot = 0, achou = 0 , chave = 0 , codigo;
               do{
                    codigo = input.nextInt();
                    for(int i = 0 ; i < VAR ; i++){
                        aux = consulta[i].getCodigo();
                        if(codigo == aux){
                            slot = i;
                            achou = 0;
                            i = VAR-1;
                        }else{
                            achou = 1;
                        }
                    }
                    if(achou == 1){
                        System.out.println("erro, codigo nao encontrado, tente novamente.");
                        chave = 1;
                    }else{
                        chave = 0;
                    }
               }while(chave == 1);
               
               double valor_ant = consulta[slot].getValor_unitario();
               System.out.println("o valor unitario anterior era de: "+valor_ant);
               
               System.out.println("digite o novo valor:");
               double novo_valor = input.nextDouble();
               consulta[slot].setValor_unitario(novo_valor);
               System.out.println("valor unitario alterado com sucesso para "+consulta[slot].getValor_unitario()+".");
               
           }else if(opçao == 3){
               System.out.println("Digite o codigo do produto que deseja alterar a quantidade em estoque: ");
               int aux , slot = 0, achou = 0 , chave = 0 , codigo;
               do{
                    codigo = input.nextInt();
                    for(int i = 0 ; i < VAR ; i++){
                        aux = consulta[i].getCodigo();
                        if(codigo == aux){
                            slot = i;
                            achou = 0;
                            i = VAR-1;
                        }else{
                            achou = 1;
                        }
                    }
                    if(achou == 1){
                        System.out.println("erro, codigo nao encontrado, tente novamente.");
                        chave = 1;
                    }else{
                        chave = 0;
                    }
               }while(chave == 1);
               
               int quant_ant = consulta[slot].getQuantidade_estoque();
               System.out.println("a quantidade em estoque anterior era de: "+quant_ant);
               
               System.out.println("digite a nova quantidade:");
               int novo_quant = input.nextInt();
               consulta[slot].setQuantidade_estoque(novo_quant);
               System.out.println("quantidade de estoque do produto alterada com sucesso para "+consulta[slot].getQuantidade_estoque()+".");
               
           }else if(opçao == 4){
               
               System.out.println("Digite o codigo do produto que deseja alterar o codigo do produto: ");
               int aux , slot = 0, achou = 0 , chave = 0 , codigo;
               do{
                    codigo = input.nextInt();
                    for(int i = 0 ; i < VAR ; i++){
                        aux = consulta[i].getCodigo();
                        if(codigo == aux){
                            slot = i;
                            achou = 0;
                            i = VAR-1;
                        }else{
                            achou = 1;
                        }
                    }
                    if(achou == 1){
                        System.out.println("erro, codigo nao encontrado, tente novamente.");
                        chave = 1;
                    }else{
                        chave = 0;
                    }
               }while(chave == 1);
               
               System.out.println("digite o novo codigo: ");
               int novo_cod = input.nextInt();
               consulta[slot].setCodigo(novo_cod);
               System.out.println("codigo alterado com sucesso para "+consulta[slot].getCodigo()+".");
               
           }else if(opçao == 5){
               
               System.out.println("digite a letra inicial para consulta de descriçao:");
               char letra;
               letra = input.next().charAt(0);
               
               boolean ok = false;
               String aux;
               char aux2;
               //procura se ha uma descriçao com a letra inicial.
               for(int i = 0 ; i < VAR ; i++){
                   aux = consulta[i].getDescriçao();
                   aux2 = aux.charAt(0);
                   if(aux2 == letra){
                       ok = true;
                   } 
               }
               //se tiver uma descriçao com a letra, aqui rola a listagem
               if(ok == true){
                    System.out.println("listagem dos produtos com letra inical da descriçao igual a ' "+letra+" ' :");
                    for(int i = 0 ; i < VAR ; i++){
                        aux = consulta[i].getDescriçao();
                        aux2 = aux.charAt(0);
                        if(aux2 == letra){
                            System.out.println("produto de codigo: "+consulta[i].getCodigo()+" ; descriçao: "+consulta[i].getDescriçao()+" ; preço unitario: "+consulta[i].getValor_unitario()+" ; quantidade em estoque: "+consulta[i].getQuantidade_estoque()+" .");
                        } 
                    }
               }else{
                   System.out.println("Nao foi encontrado descriçao com letra inicial igual a letra digitada em nosso banco de dados.");
               }
               
           }else if(opçao == 6){
               int aux;
               System.out.println("Listagem dos produtos com estoque infeior a 5 unidades:");
               for(int i = 0 ; i < VAR ; i++){
                   aux = consulta[i].getQuantidade_estoque();
                   if(aux < 5){
                       System.out.println("produto de codigo: "+consulta[i].getCodigo()+" ; descriçao: "+consulta[i].getDescriçao()+" ; preço unitario: "+consulta[i].getValor_unitario()+" ; quantidade em estoque: "+consulta[i].getQuantidade_estoque()+" .");
                    }  
                }
               
           }else if(opçao == 7){
               System.out.println("Encerrando o programa. ate mais."); 
           }
           
        }while(opçao != 7);
        
    }
    public static void Menu(){
        System.out.println("\n***MENU***");
        System.out.println("1. Alterar descriçao de um produto.");
        System.out.println("2. Alterar o valor unitario de um produto.");
        System.out.println("3. Alterar a quantidade em estoque de um produto.");
        System.out.println("4. alterar o codigo de um produto.");
        System.out.println("5. Listar os produtos que tem letra incial igual a letra inicial que esta na descrita do produto.");
        System.out.println("6. Listar todos os produtos com quantidade de estoque infeior a cinco(5) unidades.");
        System.out.println("7. Encerrar programa.\n");
    }
    
}
