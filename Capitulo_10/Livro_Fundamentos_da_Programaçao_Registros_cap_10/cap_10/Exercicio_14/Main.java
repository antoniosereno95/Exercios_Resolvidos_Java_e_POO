 
package Exercicio_14;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int VAR_m = 1/*3*/ , VAR_p = 1/*5*/;
        int VAR_c = 3/*VAR_m * VAR_p*/;
        
        //construir os Objetos
        Registro_medico Medicos[];
        Medicos = new Registro_medico[VAR_m];
        for(int i = 0 ; i < VAR_m ; i++ ){
            Medicos[i] = new Registro_medico();
        }
        
        
        Registro_paciente Pacientes[];
        Pacientes = new Registro_paciente[VAR_p];
        for(int i = 0 ; i < VAR_p ; i++){
            Pacientes[i] = new Registro_paciente();
        }
        
        Registro_consulta Consultas[];
        Consultas = new Registro_consulta[VAR_c];
        for(int i = 0 ; i < VAR_c ; i++){
            Consultas[i] = new Registro_consulta();
        }
        
        //rotina de cadastro
        System.out.println("vamos começar o cadastro dos pacientes:");
        for(int i = 0 ; i < VAR_p ; i++){
            System.out.println("digite o codigo do paciente "+(i+1)+" :");
            int cop = input.nextInt();
            boolean cod_existente = false;
            for(int j = 0 ; j < VAR_p ; j++){
                if(Pacientes[j].getCodigo_paciente() == cop){
                    cod_existente = true;
                }
            }
            while(cod_existente == true){
                System.out.println("codigo do paciente ja existente, tente novamente.");
                cop = input.nextInt();
                for(int j = 0 ; j < VAR_p ; j++){
                    if(Pacientes[j].getCodigo_paciente() == cop){
                        cod_existente = true;
                        if(j != VAR_p-1){
                            j = VAR_p - 1;
                        }
                    }else{
                        cod_existente = false;
                    }
                }
            }
            Pacientes[i].setCodigo_paciente(cop);
            
            System.out.println("digite o nome do paciente "+(i+1)+" :");
            String n = input.next();
            Pacientes[i].setNome_paciente(n);
            
            System.out.println("digite o endereço do paciente:");
            String end = input.next();
            Pacientes[i].setEndereço_paciente(end);
            
            System.out.println("digite o telefone "+(i+1)+" :");
            int tel = input.nextInt();
            Pacientes[i].setTelefone_paciente(tel);
            
        }
        System.out.println("ok, pacientes cadastrados com sucesso.");    
        
        System.out.println("Agora vamos cadastrar os medicos:");
        for(int i = 0 ; i < VAR_m ; i++){
            System.out.println("digite o codigo do medico "+(i+1)+" :");
            int cod = input.nextInt();
            boolean codigo_repetido = false;
            for(int j = 0 ; j < VAR_m ; j++){
                if(Medicos[j].getCodigo_medico() == cod){
                    codigo_repetido = true;
                }
            }
            while(codigo_repetido == true){
                cod = input.nextInt();
                codigo_repetido = false;
                for(int j = 0 ; j < VAR_m ; j++){
                    if(Medicos[j].getCodigo_medico() == cod){
                    codigo_repetido = true;
                    }
                }
            }
            Medicos[i].setCodigo_medico(cod);
            
            System.out.println("digite o nome do medico "+(i+1)+" :");
            String n = input.next();
            Medicos[i].setNome_medico(n);
            
            System.out.println("digite o telefone do medico "+(i+1)+" :");
            int tel = input.nextInt();
            Medicos[i].setTelefone_medico(tel);
            
            System.out.println("digite o endereço do medico "+(i+1)+" :");
            String end = input.next();
            Medicos[i].setEndereço_medico(end);
            
        }
        System.out.println("ok, medicos cadastrados com sucesso.");
        System.out.println("agora vamos cadastrar as consultas");
        for(int i = 0 ; i < VAR_c ; i++){
            System.out.println("digite o numero da consulta "+(i+1)+" :");
            int numb = input.nextInt();
            boolean codigo_repetido = false;
            for(int j = 0 ; j < VAR_m ; j++){
                if(Medicos[j].getCodigo_medico() == numb){
                    codigo_repetido = true;
                }
            }
            while(codigo_repetido == true){
                numb = input.nextInt();
                codigo_repetido = false;
                for(int j = 0 ; j < VAR_m ; j++){
                    if(Medicos[j].getCodigo_medico() == numb){
                    codigo_repetido = true;
                    }
                }
            }
            Consultas[i].setNumero_consulta(numb);
            
            System.out.println("digite o codigo do medigo que vai atender a consulta "+(i+1)+" :");
            int cod = input.nextInt();
            boolean codigo_existente = false;
            for(int j = 0 ; j < VAR_m ; j++){
                if(Medicos[j].getCodigo_medico() == cod){
                    codigo_existente = true;
                }
            }
            while(codigo_existente == false){
                System.out.println("codigo do medico digitado nao consta no banco de dados, tente novamente.");
                cod = input.nextInt();
                for(int j = 0 ; j < VAR_m ; j++){
                    if(Medicos[j].getCodigo_medico() == cod){
                    codigo_existente = true;
                    }
                }
            }
            Consultas[i].setCodigo_medico(cod);
            
            System.out.println("digite o codigo do paciente que sera atendido na consulta "+(i+1)+" :");
            int cop = input.nextInt();
            boolean cod_existente = false;
            for(int j = 0 ; j < VAR_p ; j++){
                if(Pacientes[j].getCodigo_paciente() == cop){
                    cod_existente = true;
                }
            }
            while(cod_existente == false){
                System.out.println("codigo do paciente digitado nao consta no banco de dados, tente novamente.");
                cop = input.nextInt();
                for(int j = 0 ; j < VAR_p ; j++){
                    if(Pacientes[j].getCodigo_paciente() == cop){
                    cod_existente = true;
                    }
                }
            }
            Consultas[i].setCodigo_paciente(cop);
            
            System.out.println("digite o dia em q a consulta "+(i+1)+" esta marcada:");
            String d = input.next();
            String seg = "segunda" ,ter = "terca" , quar = "quarta" , quin = "quinta" , sex = "sexta" ;
            boolean ok = false;
            while(ok == false){
                if(d.equalsIgnoreCase(ter) || d.equalsIgnoreCase(seg) || d.equalsIgnoreCase(quar) || d.equalsIgnoreCase(quin) || d.equalsIgnoreCase(sex)){
                    ok = true;
                }else{
                    System.out.println("dia invalido, tente novamente.");
                    d = input.next();
                }
            }
            Consultas[i].setDia(d);
            
            System.out.println("digite a hora redonda, ex: 9 ou 14 ; *obs: horario de funcionamento das 8 as 18h, da consulta "+(i+1)+" :");
            int h = input.nextInt();
            while(h < 8 || h > 18){
                System.out.println("horario invalido, tente novamente(8 as 18h).");
                h = input.nextInt();
            }
            Consultas[i].setHora(h);
            
            //testar se ja tem outro medico nesse dia
            int num_consulta_da_vez = Consultas[i].getNumero_consulta();
            String dia_da_vez = Consultas[i].getDia();
            int cod_do_medico_da_vez = Consultas[i].getCodigo_medico();
            int g = 0;
            for(int k = 0 ; k < VAR_c ; k++){
                String dia_compara = Consultas[k].getDia();
                if(dia_da_vez.equalsIgnoreCase(dia_compara) && num_consulta_da_vez != Consultas[k].getNumero_consulta() && cod_do_medico_da_vez == Consultas[k].getCodigo_medico() ){
                    g++;
                }
            }
            if(g >= 2){
                System.out.println("O medico ja apresenta mais de duas consultas no dia em questao, tente novamente o cadastro da ocnsulta.");
                i--;
            }else{
                System.out.println("consulta cadastrada.");
            }
            
        }
        System.out.println("cadastro das consultas terminado com sucesso!");
        
        //rotina pra mostrar todas as consultas de um determinado dia.
        System.out.println("listagem das consultas da semana:");
        System.out.println("segunda:");
        String seg = "segunda";
        for(int i = 0 ; i < VAR_c ; i ++){
            String dia = Consultas[i].getDia();
            if(dia.equalsIgnoreCase(seg)){
                System.out.println("numero da consulta: "+Consultas[i].getNumero_consulta());
                System.out.println("dia da semana: "+Consultas[i].getDia());
                System.out.println("hora : "+Consultas[i].getHora());
                System.out.println("codigo do medico: "+Consultas[i].getCodigo_medico());
                System.out.println("codigo do paciente: "+Consultas[i].getCodigo_paciente());
            }
        }
        System.out.println("\nterça:");
        String ter = "terca" ;
        for(int i = 0 ; i < VAR_c ; i ++){
            String dia = Consultas[i].getDia();
            if(dia.equalsIgnoreCase(ter)){
                System.out.println("numero da consulta: "+Consultas[i].getNumero_consulta());
                System.out.println("dia da semana: "+Consultas[i].getDia());
                System.out.println("hora : "+Consultas[i].getHora());
                System.out.println("codigo do medico: "+Consultas[i].getCodigo_medico());
                System.out.println("codigo do paciente: "+Consultas[i].getCodigo_paciente());
            }
        }
        System.out.println("\nquarta:");
        String quar = "quarta" ;
        for(int i = 0 ; i < VAR_c ; i ++){
            String dia = Consultas[i].getDia();
            if(dia.equalsIgnoreCase(quar)){
                System.out.println("numero da consulta: "+Consultas[i].getNumero_consulta());
                System.out.println("dia da semana: "+Consultas[i].getDia());
                System.out.println("hora : "+Consultas[i].getHora());
                System.out.println("codigo do medico: "+Consultas[i].getCodigo_medico());
                System.out.println("codigo do paciente: "+Consultas[i].getCodigo_paciente());
            }
        }
        System.out.println("\nquinta:");
        String quin = "quinta" ;
        for(int i = 0 ; i < VAR_c ; i ++){
            String dia = Consultas[i].getDia();
            if(dia.equalsIgnoreCase(quin)){
                System.out.println("numero da consulta: "+Consultas[i].getNumero_consulta());
                System.out.println("dia da semana: "+Consultas[i].getDia());
                System.out.println("hora : "+Consultas[i].getHora());
                System.out.println("codigo do medico: "+Consultas[i].getCodigo_medico());
                System.out.println("codigo do paciente: "+Consultas[i].getCodigo_paciente());
            }
        }
        System.out.println("\nsexta:");
        String sex = "sexta" ;
        for(int i = 0 ; i < VAR_c ; i ++){
            String dia = Consultas[i].getDia();
            if(dia.equalsIgnoreCase(sex)){
                System.out.println("numero da consulta: "+Consultas[i].getNumero_consulta());
                System.out.println("dia da semana: "+Consultas[i].getDia());
                System.out.println("hora : "+Consultas[i].getHora());
                System.out.println("codigo do medico: "+Consultas[i].getCodigo_medico());
                System.out.println("codigo do paciente: "+Consultas[i].getCodigo_paciente());
            }
        }
        System.out.println("fim da listagem das consultas por dia da semana.");
        //fim da listagem
    }
}
