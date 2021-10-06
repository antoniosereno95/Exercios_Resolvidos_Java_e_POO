
package Exercicio_16;

public class Registro_ingredientes {
    
    int codigo_ingrediente;
    String descriçao;
    
    public void Registro_ingredientes(){
        codigo_ingrediente = 0;
        descriçao = "";
    }
    
    //set
    public void setCodigo_ingrediente(int co){
        codigo_ingrediente = co;
    }
    public void setDescriçao(String d){
        descriçao = d;
    }
    
    //get
    public int getCodigo_ingrediente(){
        return codigo_ingrediente;
    }
    public String getDescriçao(){
        return descriçao;
    }
    
}
