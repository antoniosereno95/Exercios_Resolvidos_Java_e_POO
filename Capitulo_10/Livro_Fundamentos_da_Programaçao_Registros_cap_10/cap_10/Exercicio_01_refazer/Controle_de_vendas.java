
package Exercicio_01_refazer;

import java.util.Scanner;
public class Controle_de_vendas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Passo 1:declarar e contruir os 4 cadastros dos vendedores para os 12 meses do ano.
        Cadastro vendedores[][];
        vendedores = new Cadastro[4][12];
        //contruir cada cadastro um por um.
        for(int i = 0; i < 4 ; i++){
            for(int j = 0 ; j < 12 ; j++){
                vendedores[i][j] = new Cadastro();
            }
        }
        
        //Passo 2: corpo do programa.
        int opçao = 0;
        while(opçao != 7){
          Menu();
          System.out.print("Digite a opçao escolhida: ");
          opçao = input.nextInt();
          
          if(opçao == 1){
            //cadastrar codigo do vendedor
            //pede o slot cadastral que no caso é o 'i' da matriz
            int slot_cadastral;
            System.out.println("Em qual slot cadastral voce deseja por as informaçoes do novo vendedor? escolha entre os slots de 0 a 3.");
            slot_cadastral = input.nextInt();
            while(slot_cadastral<0 || slot_cadastral>3){
                  System.out.println("Erro! Só existem 4 slots cadastrais, escolha um numero no intervalo de 0 a 3, tente novamente.");
                  slot_cadastral = input.nextInt();
            }
            //pede o codigo que vai ser inserido na varivel "codigo_vendedor" na Class Cadastro.
            int codigo;
            boolean codigo_ok = false;
            while(codigo_ok == false){
                System.out.println("Digite o codigo que deseja dar ao vendedor:");
                codigo = input.nextInt();
                while(codigo == 0){
                    System.out.println("o codigo nao pode ser zero, tente novamente.");
                    codigo = input.nextInt();
                }
                //um for pra ver se o codigo ja esta sendo utilizado.
                for(int i = 0; i < 4 ; i++){
                    if( codigo == vendedores[i][0].codigo_vendedor ){
                        System.out.println("O codigo ja esta sendo utilizado no slot_cadastral "+i+" tente novamente.");
                        codigo_ok = false;
                    }else{
                        //set o codigo no slot cadastral
                        for(int j = 0 ; j < 12 ; j ++){
                            vendedores[slot_cadastral][j].setCodigo(codigo);
                        }
                        System.out.println("codigo "+codigo+" cadastrado com sucesso no slot cadastral "+slot_cadastral+".");
                        codigo_ok = true;
                    } 
                }
            }
            //termina o cadastro.
            // extra: apresentar uma mensagem com os numeros do slots cadastrais que ainda estao vagos(no caso os vagos tem valor == 0).
          }else if(opçao == 2){
              //****essa parte esta errado pois deveriam ter mais de um slot para vendas, so que eu so sei criar um slot para vendas, pesquisar sobre o assunto depois, por enquanto vai ficar assim mesmo.
              
              
              //cadastrar venda
              //le o codigo e verifica se ele esta cadastrado.
              int codigo;
              int slot_do_codigo_do_vendedor = 0;
              boolean codigo_encontrado = false;
              while(codigo_encontrado == false){
                System.out.println("digite o codigo do vendedor cadastrado:");
                codigo = input.nextInt();
                while(codigo == 0){
                    System.out.println("O codigo do vendedor deve ser diferente de ZERO");
                    codigo = input.nextInt();
                }
                for(int i = 0 ; i < 4 ; i++){
                    if( codigo == vendedores[i][0].getCodigo() ){
                        slot_do_codigo_do_vendedor = i;
                        codigo_encontrado = true;
                    }else{
                        System.out.println("O codigo digitaqdo nao foi encontrado no nosso banco de dados, tente novamente");
                        codigo_encontrado = false;
                    }
                }
              }
              
              //le o mes em que a venda sera cadastrada.
              int mes;
              System.out.println("digite o mes do ano em que deseja cadastrar a venda:");
              mes = input.nextInt();
              while(mes < 1 || mes > 12){
                System.out.println("mes invalido, digite um numero entre 1(janeiro) e 12(dezembro).");
                mes = input.nextInt();
              }
              
              //Se ja houver uma venda cadastrada no mes digitado, exibir mensagem de erro.
              
              
              //le a venda a ser cadastrada.
              double venda_p_cadastrar;
              System.out.println("digite o valor da venda efetuada pelo vendedor:");
              venda_p_cadastrar = input.nextDouble();
              while(venda_p_cadastrar <= 0){
                  System.out.println("Nao se pode cadastrar prejuizo, se houver algum problema, digite ZERO.");
                  venda_p_cadastrar = input.nextDouble();
              }
              
              //cadastro a venda.
              vendedores[slot_do_codigo_do_vendedor][mes].setVenda(venda_p_cadastrar);
              
              //termina o cadastro da venda
          }else if(opçao == 3){
              //le e verifica o codico 
              int codigo=0;
              int slot_do_codigo_do_vendedor = 0;
              boolean codigo_encontrado = false;
              while(codigo_encontrado == false){
                System.out.println("digite o codigo do vendedor cadastrado:");
                codigo = input.nextInt();
                while(codigo == 0){
                    System.out.println("O codigo do vendedor deve ser diferente de ZERO");
                    codigo = input.nextInt();
                }
                for(int i = 0 ; i < 4 ; i++){
                    if( codigo == vendedores[i][0].getCodigo() ){
                        slot_do_codigo_do_vendedor = i;
                        codigo_encontrado = true;
                    }else{
                        System.out.println("O codigo digitaqdo nao foi encontrado no nosso banco de dados, tente novamente");
                        codigo_encontrado = false;
                    }
                }
              }
              
              //le e verifica o mes 
              int mes;
              System.out.println("digite o mes do ano em que deseja consultar o total de venda:");
              mes = input.nextInt();
              while(mes < 1 || mes > 12){
                System.out.println("mes invalido, digite um numero entre 1(janeiro) e 12(dezembro).");
                mes = input.nextInt();
              }
              
              double vendas_do_mes_especifico;
              
              vendas_do_mes_especifico = vendedores[slot_do_codigo_do_vendedor][mes].getVenda();
              
              System.out.println("A venda do mes "+mes+" do vendedor de codigo "+codigo+" foi de: "+vendas_do_mes_especifico+" ." );
              
              //termina a opçao 3.
          }else if(opçao == 4){
              //le e verifica o codigo do vendedor
              int codigo;
              int slot_do_codigo_do_vendedor = 0;
              boolean codigo_encontrado = false;
              while(codigo_encontrado == false){
                System.out.println("digite o codigo do vendedor cadastrado:");
                codigo = input.nextInt();
                while(codigo == 0){
                    System.out.println("O codigo do vendedor deve ser diferente de ZERO");
                    codigo = input.nextInt();
                }
                for(int i = 0 ; i < 4 ; i++){
                    if( codigo == vendedores[i][0].getCodigo() ){
                        slot_do_codigo_do_vendedor = i;
                        codigo_encontrado = true;
                    }else{
                        System.out.println("O codigo digitaqdo nao foi encontrado no nosso banco de dados, tente novamente");
                        codigo_encontrado = false;
                    }
                }
              }
              
              //soma as vendas do ano do vendedor.
              double soma_vendas = 0;
              for(int j = 0 ; j < 12 ; j++){
                  soma_vendas += vendedores[slot_do_codigo_do_vendedor][j].getVenda();
              }
              System.out.println("A soma total das vendas do vendedor foi de: "+soma_vendas);
              //termina a opçao 4
          }else if(opçao == 5){
              //le e verifica o mes 
              int mes;
              System.out.println("digite o mes do ano em que deseja consultar a venda:");
              mes = input.nextInt();
              while(mes < 1 || mes > 12){
                System.out.println("mes invalido, digite um numero entre 1(janeiro) e 12(dezembro).");
                mes = input.nextInt();
              }
              
              //array com todos as vendas do mes.
              double maior_soma = vendedores[0][mes].getVenda();
              int codigo_ganhador = 0;
              for(int i = 1; i < 4 ; i++){
                  if( maior_soma < vendedores[i][mes].getVenda() ){
                      maior_soma = vendedores[i][mes].getVenda();
                      codigo_ganhador = i;
                  }
              }
              
              int printa_codigo = vendedores[codigo_ganhador][0].getCodigo();
              
              System.out.println("o codigo do vendedor qu emais vendeu no mes "+mes+" foi: "+printa_codigo);
              
          }else if(opçao == 6){
              //**era pra mostrar o mesm com mais vendas, mas aqui vou fazer pra dizer o mes que tem maior suma de vendas.
              
              //define a soma das vendas do primeiro mes como a melhor, para poder usar como comparaçao.
              double mais_vendas = 0 ;
              for(int i = 0; i < 4 ; i++){
                  mais_vendas += vendedores[i][0].getVenda();
              }
              
              //rodar todos os meses de todos os vendedores pra ver qual soma é maior.
              int mes_vencedor = 300;
              double soma_vendas = 0;
              
              for(int j = 0 ; j < 12 ; j++){
                  for(int i = 1; i < 4 ; i++){
                    soma_vendas += vendedores[i][j].getVenda();
                }
                  if(soma_vendas > mais_vendas){
                      mais_vendas = soma_vendas;
                      mes_vencedor = j;
                  }
              }
              
              System.out.println("O mes com uma suma maior de vendas foi o "+(mes_vencedor+1)+" com um total de "+mais_vendas+" em vendas.");
              
          }else if(opçao == 7){
              //finalizar o programa
              System.out.println("Encerrando o programa, ate logo.");
          }
          
        }//o while do programa termina aqui =).
    }
    public static void Menu(){
        System.out.println("***MENU***");
        System.out.println("1. Cadastrar vendedor");
        System.out.println("2. Cadastrar venda");
        System.out.println("3. Consultar as vendas de um funcionário em determinado mês.");
        System.out.println("4. Consultar o total das vendas de determinado vendedor.");
        System.out.println("5. Mostrar o número do vendedor que mais vendeu em determinado mês.");
        System.out.println("6. Mostrar o número do mês com mais vendas.");
        System.out.println("7. Finalizar o programa.");
    }
}
