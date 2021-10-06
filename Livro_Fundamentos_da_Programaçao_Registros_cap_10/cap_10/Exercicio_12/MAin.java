
package Exercicio_12;

import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MAin {
    public static void main(String[] args) throws ParseException{
        Scanner input = new Scanner(System.in);
        //chama o editor de texto das datas.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        //as operaçoes com datas seram feitas com essa biblioteca aqui.
        Calendar cal = Calendar.getInstance();
        /*
        System.out.println("digite sua data de nascimento:");
        //isso daqui le a data no scanner
        Date nascimento = sdf.parse(input.next());
        
        //quando for printar ou mandar pra string usar essa funçao
        System.out.println(""+sdf.format(nascimento));
        
        //aqui eu transformo o date ja no formato SDF para string
        String nasc = sdf.format(nascimento);
        System.out.println(" string : "+nasc);
        */
        //------------------------------------------------------------
        
        int VAR = 2;
        int M_VAR = 3*VAR;
        
        //contruir o objeto Cliente
        Registro_cliente Cliente[];
        Cliente = new Registro_cliente[VAR];
        for(int i = 0 ; i < VAR ; i++){
            Cliente[i] = new Registro_cliente();
        }
        
        //construir o objeto Recebido
        Registro_recebimentos Recebido[];
        Recebido = new Registro_recebimentos[M_VAR];
        for(int i = 0 ; i < M_VAR ; i++){
            Recebido[i] = new Registro_recebimentos();
        }
        
        //alimentar o banco de dados.
        
        //rotina
        int opçao = 0;
        while(opçao != 4){
            Menu();
            opçao = input.nextInt();
            
            if(opçao == 1){
                System.out.println("digite o seu codigo do cliente:");
                int cod = input.nextInt();
                while(cod < 0){
                    System.out.println("error");
                    cod = input.nextInt();
                }
                
                boolean cliente_cadastrado = false;
                for(int i = 0 ; i < VAR ; i++){
                    if(cod == Cliente[i].getCodigo_cliente() ){
                        cliente_cadastrado = true;
                    }
                }
                
                if(cliente_cadastrado == true ){
                    //verificar se o cliente tem te 3 docs no nome dele;
                    int num_doc = 0;
                    for(int i = 0 ; i < M_VAR ; i++ ){
                        if(cod == Recebido[i].getCodigo_cliente() ){
                            num_doc++;
                        }
                    }
                    
                    if(num_doc >= 3){
                        System.out.println("o cliente atingiu a cota maxima de documentos em seu nome no banco de dados.");
                    }else if(num_doc < 3){
                        System.out.println("ok, vamos começar o cadastro do documento recebido.");
                        //achar um slot livre no banco de dados.
                        int slot = Integer.MAX_VALUE;
                        for(int i = 0 ; i < M_VAR ; i++ ){
                            if(Recebido[i].getCodigo_cliente() == 0 ){
                                slot = i;
                                i = M_VAR - 1;
                            } 
                        }
                        if( slot != Integer.MAX_VALUE ){
                            System.out.println("digite o numero do documento:");
                            int doc_n = input.nextInt();
                            Recebido[slot].setNumero_documento(doc_n);
                            
                            System.out.println("digite o valor do documento:");
                            double valor = input.nextDouble();
                            Recebido[slot].setValor_documento(valor);
                            
                            System.out.println("digite a data de emissao do documento:");
                            Date emissao = sdf.parse(input.next());
                            String e = sdf.format(emissao);
                            Recebido[slot].setData_emissao(e);
                            
                            System.out.println("digite a data de vencimento do documento:");
                            Date vencimento = sdf.parse(input.next());
                            String ve = sdf.format(vencimento);
                            Recebido[slot].setData_vencimento(ve);
                            
                            Recebido[slot].setCodigo_cliente(cod);
                            System.out.println("documento cadastrado com sucesso!");
                        }else{
                            System.out.println("o banco de dados esta cheio tente novamente mais tarde.");
                        }  
                    }
                }else{
                    System.out.println("cliente nao cadastrado, voltando pro menu principal.");
                }
                //fim da opçao 1.
            }else if(opçao == 2){
                int opçao2 = 0;
                while(opçao2 != 5){
                    int slot2 = Integer.MAX_VALUE;
                    
                    System.out.println("digite o codigo do cliente:");
                    int ver = input.nextInt();
                    for(int i = 0 ; i < VAR ; i++ ){
                        if(Cliente[i].getCodigo_cliente() == ver){
                            slot2 = i;
                            i = VAR-1;
                        } 
                    }
                    if(slot2 == Integer.MAX_VALUE){
                        System.out.println("codigo do cliente nao encontrado, voltando ao menu principal.");
                    }else{
                        Menu2();
                        opçao2 = input.nextInt();
                        if(opçao2 == 1){
                            System.out.println("digite o novo codigo do cliente:");
                            int cod2 = input.nextInt();
                            Cliente[slot2].setCodigo_cliente(cod2);
                        }else if(opçao2 == 2){
                            System.out.println("digite o novo nome:");
                            String n = input.next();
                            Cliente[slot2].setNome_cliente(n);
                        }else if(opçao == 3){
                            System.out.println("digite o novo endereço:");
                            String end = input.next();
                            Cliente[slot2].setEndereço(end);
                        }else if(opçao == 4){
                            System.out.println("digite o novo numero de telefone:");
                            int fone = input.nextInt();
                            Cliente[slot2].setTelefone(fone);
                        }else if(opçao == 5){
                            System.out.println("encerrando a alterçao de cadastro.");
                        }
                    }
                }
                //fim da opçao 2.
            }else if(opçao == 3){
                System.out.println("digite a data para pesquisa:");
                Date limite = sdf.parse(input.next());
                String data_limite = sdf.format(limite);
                
                int dias_entre_datas;
                long dias;
                String data_vencimento;
                Date vencimento;
                for(int i = 0 ; i < M_VAR ; i++ ){
                    data_vencimento = Recebido[i].getData_vencimento();
                    vencimento = sdf.parse(data_limite);
                    //calculos para ver o dia entre datas;
                    dias = limite.getTime() - vencimento.getTime();
                    dias_entre_datas = (int)(dias/86400000);//numero de dias entre as datas
                    
                    if(dias_entre_datas > 0){
                        System.out.println("numero do documento: "+Recebido[i].getNumero_documento());
                        System.out.println("data de emissao: "+Recebido[i].getData_emissao());
                        System.out.println("data de vencimento: "+Recebido[i].getData_vencimento());
                        System.out.println("codigo do cliente: "+Recebido[i].getCodigo_cliente());
                    }
                }
                //fim da opçao 3.
            }else if(opçao == 4){
                System.out.println("Encerrando o programa, ate mais.");
            }
            
        }
        
    }
    public static void Menu(){
        System.out.println("--- Menu ---");
        System.out.println("1. Incluir um Recebimento.");
        System.out.println("2. Alterar um cadastro de um Cliente.");
        System.out.println("5. Listar os Recebimentos com data de vencimento dentro da data fornecida.");
        System.out.println("6. Encerrar o programa.");
    }
    public static void Menu2(){
        System.out.println("qual parte do cadastro do cliente voce deseja mudar:");
        System.out.println("1. codigo do cliente");
        System.out.println("2. nome");
        System.out.println("3. endereço");
        System.out.println("4. fone");
        System.out.println("5. terminar a alteraçao de cadastro.");
    }
}
