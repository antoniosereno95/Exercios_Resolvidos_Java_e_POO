
package Exercicio_10_DICAS_DATAS;

import java.text.ParseException;
import java.util.Scanner;

//import datas.
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
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
        
        //contruir os objetos para cada documentos
        int VAR = 15;
        
        Registro Doc[];
        Doc = new Registro[VAR];
        for(int i = 0 ; i < VAR ; i++){
            Doc[i] = new Registro();
        }
        
        //inicio da rotina
        System.out.println("vamos iniciar o cadastro dos "+VAR+" documentos:");
        for(int i = 0 ; i < VAR ; i++){
            
            System.out.println("Digite o numero do documento:");
            int doc = input.nextInt();
            while(doc<=0){
                System.out.println("error");
                doc = input.nextInt();
            }
            Doc[i].setNum_documento(doc);
            
            System.out.println("Digite o numero do codigo do cliente:");
            int cod = input.nextInt();
            while(cod<=0){
                System.out.println("error");
                cod = input.nextInt();
            }
            Doc[i].setCodigo_cliente(cod);
            
            System.out.println("Digite a data de vencimento do documento:");
            Date vencimento = sdf.parse(input.next());
            String venc = sdf.format(vencimento);
            Doc[i].setData_venciemnto(venc);
            
            System.out.println("Digite a data de pagamento do documento:");
            Date pagamento = sdf.parse(input.next());
            String pag = sdf.format(pagamento);
            Doc[i].setData_pagamento(pag);
            
            System.out.println("Digite o valor da conta:");
            double val = input.nextDouble();
            while(val < 0){
                System.out.println("error");
                val = input.nextDouble();
            }
            Doc[i].setValor_conta(val);
            
           
            
            //calculo pra ver se as datas de vencimento e pagamento estao ok.
            int dias_entre_venc_pag , dias_juros = 0;
            dias_entre_venc_pag = vencimento.compareTo(pagamento);
            
            if(dias_entre_venc_pag >= 0){
                //nesse dois casos nao tem juros
                //pagamento no dia de vencimento ou anterior a data de vencimento
                Doc[i].juros = 0;
                
            }else if(dias_entre_venc_pag < 0){
                //nesse caso tem juros
                
                //calculo da diferença de dias.
                long data_dif;
                data_dif = pagamento.getTime() - vencimento.getTime();
                long data_to_int = data_dif/86400000L; 
                //esse numero é pq o calculo é feito em long e em milisegundos(*parece);
                dias_juros =(int)data_to_int;
            }
            
            //calculo do total de juros sabendo que a diferença de dias foi recebida pela variavel " int dias_juros ".
            double multa , a_pagar , juros_parcial;
            a_pagar = Doc[i].getValor_conta();
            multa = (a_pagar * 0.02)/100;
            
            juros_parcial = multa * dias_juros;
            Doc[i].setJuros(juros_parcial);
            
            //agora vamos settar a conta total 
            if(dias_entre_venc_pag < 0){
                //tem que mostrar o total a receber "valor + juros".
                double v = Doc[i].getValor_conta();
                double j = Doc[i].getJuros();
                double c = v + j;
                Doc[i].setConta_total(c);
                
            }else{
                double v = Doc[i].getValor_conta();
                Doc[i].setConta_total(v);
                
            }
        }//acaba a rotina de cadastro dos documentos.
        
        //começa a rotina de listagem.
        System.out.println("---LISTAGEM DOS DOCUMENTOS CADASTRADOS---");
        for(int i = 0 ; i < VAR ; i++){
            System.out.println("Documento "+(i+1));
            System.out.println("numero do documento: "+Doc[i].getNum_documento());
            System.out.println("codigo do cliente: "+Doc[i].getCodigo_cliente());
            System.out.println("data de vencimento: "+Doc[i].getData_venciemnto());
            System.out.println("data de pagamento: "+Doc[i].getData_pagamento());
            System.out.println("valor da conta: "+Doc[i].getValor_conta());
            System.out.println("valor dos juros cobrados: "+Doc[i].getJuros());
            System.out.println("valor total a pagar: "+Doc[i].getConta_total());
            System.out.println("\n-----------------\n");
        }
        
        //rotina de mostragem do valor total a receber de todos os documentos juntos.
        double conta_final = 0;
        for(int i = 0 ; i < VAR ; i++){
            conta_final += Doc[i].getConta_total();
        }
        System.out.println("O total a receber dos documentos cadastrados é: "+conta_final);
        
    }
}
