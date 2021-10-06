
package Exercicio_13;

public class Registro_estaçao {
    int codigo_estaçao;
    String nome_estaçao;
    
    //construtor
    public void Registro_estaçao(){
        codigo_estaçao = 0;
        nome_estaçao = "";
    }
    
    //os set
    public void setCodigo_estaçao(int cod){
        codigo_estaçao = cod; 
    }
    public void setNome_estaçao(String est){
        nome_estaçao = est;
    }
    
    //os get
    public int getCodigo_estaçao( ){
        return codigo_estaçao ; 
    }
    public String getNome_estaçao( ){
        return nome_estaçao ;
    }
    
}
