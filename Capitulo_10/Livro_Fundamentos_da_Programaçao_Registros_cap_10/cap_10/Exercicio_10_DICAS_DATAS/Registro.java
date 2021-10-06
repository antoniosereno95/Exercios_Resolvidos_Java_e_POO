
package Exercicio_10_DICAS_DATAS;

public class Registro {
    
    int num_documento;
    int codigo_cliente;
    String data_vencimento;
    String data_pagamento;
    double valor_conta;
    double juros;
    double conta_total;
    //tem que mostrar o total a receber "valor + juros".
    
    //contrutor
    public void Registro(){
        num_documento = 0;
        codigo_cliente = 0;
        data_vencimento = "";
        data_pagamento = "";
        valor_conta = 0;
        juros = 0; 
    }
    
    //set
    public void setNum_documento(int doc){
        num_documento = doc;
    }
    public void setCodigo_cliente(int cod){
        codigo_cliente = cod;
    }
    public void setData_venciemnto(String data_v){
        data_vencimento = data_v;
    }
    public void setData_pagamento(String data_p){
        data_pagamento = data_p;
    }
    public void setValor_conta(double v){
        valor_conta = v;
    }
    public void setJuros(double j){
        juros = j;
    }
    public void setConta_total(double c){
        conta_total = c;
    }
    
    //get
    public int getNum_documento(){
        return num_documento ;
    }
    public int getCodigo_cliente(){
        return codigo_cliente;
    }
    public String getData_venciemnto(){
        return data_vencimento;
    }
    public String getData_pagamento(){
        return data_pagamento ;
    }
    public double getValor_conta(){
        return valor_conta ;
    }
    public double getJuros(){
        return juros;
    }
    public double getConta_total(){
        return conta_total;
    }
    
}
