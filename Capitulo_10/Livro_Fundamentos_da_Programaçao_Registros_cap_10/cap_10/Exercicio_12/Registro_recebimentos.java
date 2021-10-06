
package Exercicio_12;

public class Registro_recebimentos {
    
    int numero_documento;
    double valor_documento;
    String data_emissao;
    String data_vencimento;
    int codigo_cliente;
    
    //contrutor;
    public void Registro_recebimentos(){
        numero_documento = 0;
        valor_documento = 0;
        data_emissao = "";
        data_vencimento = "";
        codigo_cliente = 0;  
    }
    
    //os set;
    public void setCodigo_cliente(int cod){
        codigo_cliente = cod;
    }
    public void setNumero_documento(int doc){
        numero_documento = doc;
    }
    public void setData_emissao(String data_e){
        data_emissao = data_e;
    }
    public void setData_vencimento(String data_v){
        data_vencimento = data_v;
    }
    public void setValor_documento(double v){
        valor_documento = v;
    }
    
    //os get;
    public int getCodigo_cliente(){
        return codigo_cliente;
    }
    public int getNumero_documento( ){
        return numero_documento ;
    }
    public String getData_emissao( ){
        return data_emissao ;
    }
    public String getData_vencimento( ){
        return data_vencimento ;
    }
    public double getValor_documento( ){
        return valor_documento ;
    }
    
}
