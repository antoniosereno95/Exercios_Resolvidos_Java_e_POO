
package Exercicio_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner input = new Scanner(System.in);
        //-------------------------------------------------------------
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
        //contruir os objetos medicos
        Registro_medicos Medico[];
        Medico = new Registro_medicos[VAR];
        for(int i = 0 ; i < VAR ; i++){
            Medico[i] = new Registro_medicos();
        }
        //constrir os objetos pacientes
        Registro_pacientes Paciente[];
        Paciente = new Registro_pacientes[VAR];
        for(int i = 0 ; i < VAR ; i++){
            Paciente[i] = new Registro_pacientes();
        }
        //construir objetos consultas
        Registro_consultas Consulta[];
        Consulta = new Registro_consultas[VAR];
        for(int i = 0 ; i < VAR ; i++){
            Consulta[i] = new Registro_consultas();
        }
        
        //falata um pedaço do main aqui da coleta de dados dos pacientes 
        //e dos medicos e das consultas, pq eu nao sei essa ideia de adicionar
        //um objeto no meio do programa, e nao tem a opçao de adeicionar consultas na questao.
        
        //inicio da rotina
        int opçao = 0;
        while(opçao != 7){
            Menu();
            opçao = input.nextInt();
            
            if(opçao == 1){
                //ver se ter um slot vago.
                int slot = Integer.MAX_VALUE;
                for(int i = 0 ; i < VAR ; i++){
                    if(Medico[i].getCodigo_medico() == 0){
                        slot = i;
                    }
                }
                if(slot == Integer.MAX_VALUE){
                    System.out.println("O banco de dados se encontra lotado, tente novamente mais tarde.");
                }else{
                    System.out.println("\n-Cadastrar/Incluir um Medico-");
                    System.out.println("Digite as informaçoes pedidas:");
                    
                    System.out.println("O codigo do medico:");
                    int cod = input.nextInt();
                    Medico[slot].setCodigo_medico(cod);
                    
                    System.out.println("O nome do medico:");
                    String nome = input.next();
                    Medico[slot].setNome_medico(nome);
                    
                    System.out.println("O endereço do medico:");
                    String end = input.next();
                    Medico[slot].setEndereço_medico(end);
                    
                    System.out.println("O salario do medeico:");
                    double sal = input.nextDouble();
                    Medico[slot].setSalario_medico(sal);
                    System.out.println("cadastro feito com sucesso.");
                }
                //fim da opçao 1.
            }else if(opçao == 2){
                //ver se ter um slot vago.
                int slot = Integer.MAX_VALUE;
                for(int i = 0 ; i < VAR ; i++){
                    if(Paciente[i].getCodigo_paciente() == 0){
                        slot = i;
                    }
                }
                if(slot == Integer.MAX_VALUE){
                    System.out.println("O banco de dados se encontra lotado, tente novamente mais tarde.");
                }else{
                    System.out.println("\n-Cadastrar/Incluir um Paciente-");
                    System.out.println("Digite as informaçoes pedidas:");
                    
                    System.out.println("O codigo do paciente:");
                    int cod = input.nextInt();
                    Paciente[slot].setCodigo_paciente(cod);
                    
                    System.out.println("O nome do paciente:");
                    String nome = input.next();
                    Paciente[slot].setNome_paciente(nome);
                    
                    System.out.println("O endereço do paciente:");
                    String end = input.next();
                    Paciente[slot].setEndereço_paciente(end);
                    
                    System.out.println("O salario do paciente:");
                    int id = input.nextInt();
                    Paciente[slot].setIdade(id);
                    System.out.println("cadastro feito com sucesso.");
                }
                //fim da opçao 2.
            }else if(opçao == 3){
                System.out.println("\n-Alterar um cadastro de um Medico-");
                System.out.println("digite o codigo do medico que deseja alterar o cadastro:");
                int cod = input.nextInt();
                boolean achou = false;
                int slot2 = Integer.MAX_VALUE;
                for(int i = 0 ; i < VAR ; i++){
                    if(cod == Medico[i].getCodigo_medico() ){
                        achou = true;
                        slot2 = i;
                    }
                }
                if(achou == true){
                    System.out.println("ok, agora vamos refazer o cadastro deste medico:");
                    System.out.println("Digite as informaçoes pedidas:");
                    
                    System.out.println("O codigo do medico:");
                    cod = input.nextInt();
                    Medico[slot2].setCodigo_medico(cod);
                    
                    System.out.println("O nome do medico:");
                    String nome = input.next();
                    Medico[slot2].setNome_medico(nome);
                    
                    System.out.println("O endereço do medico:");
                    String end = input.next();
                    Medico[slot2].setEndereço_medico(end);
                    
                    System.out.println("O salario do medeico:");
                    double sal = input.nextDouble();
                    Medico[slot2].setSalario_medico(sal);
                    System.out.println("cadastro alterado com sucesso.");
                }else{
                    System.out.println("codigo nao encontrado, voltando ao menu principal.");
                }
                //fim da opçao 3.
            }else if(opçao == 4){
                System.out.println("\n-Alterar um cadastro de um Paciente-");
                System.out.println("digite o codigo do paciente que deseja alterar o cadastro:");
                int cod = input.nextInt();
                boolean achou = false;
                int slot2 = Integer.MAX_VALUE;
                for(int i = 0 ; i < VAR ; i++){
                    if(cod == Paciente[i].getCodigo_paciente() ){
                        achou = true;
                        slot2 = i;
                    }
                }
                if(achou == true){
                    System.out.println("ok, agora vamos refazer o cadastro deste medico:");
                    System.out.println("Digite as informaçoes pedidas:");
                    
                    System.out.println("O codigo do paciente:");
                    cod = input.nextInt();
                    Paciente[slot2].setCodigo_paciente(cod);
                    
                    System.out.println("O nome do paciente:");
                    String nome = input.next();
                    Paciente[slot2].setNome_paciente(nome);
                    
                    System.out.println("O endereço do paciente:");
                    String end = input.next();
                    Paciente[slot2].setEndereço_paciente(end);
                    
                    System.out.println("O salario do paciente:");
                    int id = input.nextInt();
                    Paciente[slot2].setIdade(id);
                    System.out.println("cadastro feito com sucesso.");
                }else{
                    System.out.println("codigo nao encontrado, voltando ao menu principal.");
                }
                //fim da opçao 4.
            }else if(opçao == 5){
                System.out.println("\n-Excluir o cadastro de um Medico-");
                System.out.println("digite o codigo do medico para consultarmos:");
                int cod = input.nextInt();
                int slot = Integer.MAX_VALUE;
                for(int i = 0 ; i < VAR ; i++){
                    if(cod == Medico[i].getCodigo_medico() ){
                        slot = i;
                    }
                }
                if(slot == Integer.MAX_VALUE){
                    System.out.println("codigo do medico nao encontrado, voltando ao menu principal.");
                }else{
                    //buscar o codigo do medico no Consultas.
                    boolean achou = false;
                    for(int j = 0 ; j < VAR ; j++){
                        if( cod == Consulta[j].getCodigo_medigo() ){
                            achou = true;
                        }
                    }
                    
                    if(achou == true){
                        System.out.println("O medico tem consultas registradas e por isso nao pode ser Excluido, voltando ao menu principal.");
                    }else{
                        int zeroo = 0;
                        double z = 0;
                        String zero = "";
                        Medico[slot].setCodigo_medico(zeroo);
                        Medico[slot].setEndereço_medico(zero);
                        Medico[slot].setNome_medico(zero);
                        Medico[slot].setSalario_medico(z);
                        System.out.println("Medico excluido com sucesso.");
                    }
                }
                //fim da opçao 5.
            }else if(opçao == 6){
                System.out.println("\n-Listar Consultas em determinada data-");
                System.out.println("digite a data a ser pesquisada:");
                Date data_escolhida = sdf.parse(input.next());
                String procurar_data = sdf.format(data_escolhida);
                
                //procura a data no registro.
                boolean achou = false;
                boolean compareString;
                for(int i = 0 ; i < VAR ; i++){
                    compareString = procurar_data.equals(Consulta[i].getData_consulta());
                    if( compareString == true  ){
                        achou = true;
                    }
                }
                //se tiver uma consulta com a data, listaremos ela aqui.
                if(achou == false){
                    System.out.println("Nao encontramos nenhuma consulta nesta data digitada, voltando ao menu principal.");
                }else{
                    System.out.println("As consultas encontradas na data "+procurar_data+" serao listadas abaixo:");
                    int k = 0;
                    for(int i = 0 ; i < VAR ; i++){
                        compareString = procurar_data.equals(Consulta[i].getData_consulta());
                        if( compareString == true ){
                            System.out.println("Consulta "+k+":");
                            System.out.println("numero do prontuario: "+Consulta[i].getNumero_prontuario()); 
                            System.out.println("data da consulta: "+Consulta[i].getData_consulta());
                            System.out.println("diagnostico: "+Consulta[i].getDiagnostico());
                            System.out.println("codigo do medico: "+Consulta[i].getCodigo_medigo());
                            //mostra o nome do medico
                            String nome_med = "";
                            for(int j = 0 ; j < VAR ; j ++){
                                if(Consulta[i].getCodigo_medigo() == Medico[j].getCodigo_medico() ){
                                    nome_med = Medico[j].getNome_medico();
                                    j = VAR-1;
                                }
                            }
                            System.out.println("nome do medico: "+nome_med);
                            
                            System.out.println("codigo do paciente: "+Consulta[i].getCodigo_paciente());
                            //mostra o nome do paciente
                            String nome_pac = "";
                            for(int g = 0 ; g < VAR ; g++){
                                if(Consulta[i].getCodigo_paciente() == Paciente[g].getCodigo_paciente() ){
                                    nome_pac = Paciente[g].getNome_paciente();
                                }
                            }
                            System.out.println("nome do paciente: "+nome_pac);
                            System.out.println("------------------");
                            k++;
                        }
                    }
                }
                //acaba a opçao 6.
            }else if(opçao == 7){
                System.out.println("Encerrando o programa, ate mais.");
            }
            
        }
        
    }
    public static void Menu(){
        System.out.println("--- Menu ---");
        System.out.println("1. Cadastrar/Incluir um Medico.");
        System.out.println("2. Cadastrar/Incluir um Paciente.");
        System.out.println("3. Alterar um cadastro de um Medico.");
        System.out.println("4. Alterar um cadastro de um Paciente.");
        System.out.println("5. Excluir o cadastro de um Medico.");
        System.out.println("6. Listar Consultas em determinada data.");
        System.out.println("7. Encerrar o programa.");
    }
}
