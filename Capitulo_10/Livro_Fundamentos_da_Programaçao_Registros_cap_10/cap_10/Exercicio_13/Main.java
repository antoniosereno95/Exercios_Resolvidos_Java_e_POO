
package Exercicio_13;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int VAR_e = 1;
        System.out.println("quantos estilistas seram cadastrados dessa vez?");
        VAR_e = input.nextInt();
        while(VAR_e > 20){
            System.out.println("o maximo possovel de estilistas inscritos sao 20, tente novamente.");
            VAR_e = input.nextInt();
        }
        
        //contruir os objetos estilista
        Registro_estilista Estilista[];
        Estilista = new Registro_estilista[VAR_e];
        for(int i = 0 ; i < VAR_e ; i++ ){
            Estilista[i] = new Registro_estilista();
        }
        
        //contruir os objetos roupa;
        int VAR_r = 20;
        Registro_roupa Roupa[];
        Roupa = new Registro_roupa[VAR_r];
        for(int i = 0 ; i < VAR_r ; i++ ){
            Roupa[i] = new Registro_roupa();
        }
        
        //contruir os objetos estaçao;
        Registro_estaçao Estaçao[];
        Estaçao = new Registro_estaçao[2];
        for(int i = 0 ; i < 2 ; i++){
            Estaçao[i] = new Registro_estaçao();
        }
        
        //rotina de cadastro
        System.out.println("vamos começar o cadastramento:");
        for(int i = 0 ; i < VAR_e ; i++){
            System.out.println("digite o codigo do estilista "+(i+1)+": ");
            int cod = input.nextInt();
            Estilista[i].setCodigo_estilista(cod);
            
            System.out.println("digite o nome do estilista "+(i+1)+": ");
            String n = input.next();
            Estilista[i].setNome_estilista(n);
            
            System.out.println("digite o salario do estilista "+(i+1)+": ");
            double s = input.nextDouble();
            Estilista[i].setSalario(s);
        }
        System.out.println("Ok, Estilistas cadastrados com sucesso!\nAgora vamos cadastras os codigod das estaçoes:");
        
        String e1 = "primavera-verao";
        String e2 = "outona-inverno";
        Estaçao[0].setNome_estaçao(e1);
        Estaçao[1].setNome_estaçao(e2);
        System.out.println("digite o codigo da estaçao "+Estaçao[0].getNome_estaçao()+" :");
        int code1 = input.nextInt();
        Estaçao[0].setCodigo_estaçao(code1);
        System.out.println("digite o codigo da estaçao "+Estaçao[1].getNome_estaçao()+" :");
        int code2 = input.nextInt();
        Estaçao[1].setCodigo_estaçao(code2);
        
        System.out.println("ok, estaçoes cadastradas com sucesso!\nAgora vamos cadastrar as roupas:");
        for(int i = 0 ; i < 20 ; i++){
            System.out.println("digite o codigo da roupa "+(i+1)+" :");
            int cod = input.nextInt();
            Roupa[i].setCodigo_roupa(cod);
            
            System.out.println("digite um pequena descriçao da roupa "+(i+1)+" :");
            String des = input.next();
            Roupa[i].setDescriçao_roupa(des);
            
            System.out.println("digite o codigo do estilista da roupa "+(i+1)+" :");
            int code;
            boolean achou = false;
            do{
                code = input.nextInt();
                for(int j = 0 ; j < VAR_e ; j++){
                    if(Estilista[j].getCodigo_estilista() == code){
                        achou = true;
                    }
                }
                if(achou == false){
                    System.out.println("codigo de estilista nao escontrado, tente novamente.");
                }
            }while(achou == false);
            Roupa[i].setCodigo_estilista(code);
            
            System.out.println("digite o codigo da estaçao que a roupa "+(i+1)+" pertence:");
            int code3;
            boolean achou2 = false;
            do{
                code3 = input.nextInt();
                for(int j = 0 ; j < 2 ; j++){
                    if(Estilista[j].getCodigo_estilista() == code3){
                        achou2 = true;
                    }
                }
                if(achou2 == false){
                    System.out.println("codigo de estaçao nao escontrado, tente novamente.");
                }
            }while(achou2 == false);
            Roupa[i].setCodigo_estaçao(code3);
            
            System.out.println("qual o ano que a roupa "+(i+1)+" foi criada:");
            int ano = input.nextInt();
            Roupa[i].setAno(ano);
            
            System.out.print("\n");
        }
        
        //rotina de listagem
        int opçao = 0; 
        while(opçao != 3){
            Menu();
            opçao = input.nextInt();
            if(opçao == 3){
                System.out.println("Encerrando o programa.");
            }else{
                int est = 2;
                if(opçao == 1){
                    est = 0;
                }else if(opçao == 2){
                    est = 1;
                }
                
                for(int i = 0 ; i < 20 ; i ++){
                    if(Estaçao[est].getCodigo_estaçao() == Roupa[i].getCodigo_estaçao() ){
                        System.out.println("Informaçoes da roupa:");
                        System.out.println("codigo: "+Roupa[i].getCodigo_roupa());
                        System.out.println("codigo do estilista: "+Roupa[i].getCodigo_estilista());
                        for(int j = 0 ; j < VAR_e ; j++){
                          if(Roupa[i].getCodigo_estilista() == Estilista[j].getCodigo_estilista()){
                            System.out.println("nome do estilista: "+Estilista[j].getNome_estilista());
                            if(j != VAR_e -1){
                                j = VAR_e - 1;
                            }
                          }  
                        }
                        System.out.println("descriçao da roupa: "+Roupa[i].getDescriçao_roupa());
                        System.out.println("codigo da estaçao: "+Roupa[i].getCodigo_estaçao());
                        System.out.println("ano de lancamento: "+Roupa[i].getAno());
                    }
                    System.out.print("\n");
                }
                System.out.println("Listagem completa, voltando ao menu principal.");
            }
        }
        
    }
    public static void Menu(){
        System.out.print("\n");
        System.out.println("Digite a opçao da eastaçao que deseja para listagem das roupas:");
        System.out.println("1. estaçao primavera-verao");
        System.out.println("2. estaçao outono-inverno");
        System.out.println("3. finalizar o programa");
    }
}
