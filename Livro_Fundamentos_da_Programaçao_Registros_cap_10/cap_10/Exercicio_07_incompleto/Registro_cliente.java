
package Exercicio_07_incompleto;

public class Registro_cliente {
    
    int codigo_cliente;
    String nome_cliente;
    
    public void setCodigo_cliente(int cod){
        codigo_cliente = cod;
    }
    public void setNome_cliente(String nome){
        nome_cliente = nome;
    }
    
    public int getCodigo_cliente(){
        return codigo_cliente;
    }
    public String getNome_cliente(){
        return nome_cliente;
    }
    
    public void Registro_cliente(){
        codigo_cliente = 0;
        nome_cliente = "";
    }
    
}
