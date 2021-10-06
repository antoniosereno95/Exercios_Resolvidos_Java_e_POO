
package Exercicio_12;

public class Registro_cliente {
    
    int codigo_cliente;
    String nome_cliente;
    String endereço;
    int telefone;
    
    //contrutor;
    public void Registro_cliente(){
        codigo_cliente = 0;
        nome_cliente = "";
        endereço = "";
        telefone = 0;
    }
    
    //os set;
    public void setCodigo_cliente(int cod){
        codigo_cliente = cod;
    }
    public void setNome_cliente(String nome){
        nome_cliente = nome;
    }
    public void setEndereço(String end){
        endereço = end;
    }
    public void setTelefone(int tel){
        telefone = tel;
    }
    
    //os get;
    public int getCodigo_cliente(){
        return codigo_cliente;
    }
    public String getNome_cliente( ){
        return nome_cliente ;
    }
    public String getEndereço( ){
        return endereço ;
    }
    public int getTelefone( ){
        return telefone ;
    }
    
}
