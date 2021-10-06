 
package Exercicio_14;
 
public class Registro_paciente {
    
    int codigo_paciente;
    int telefone_paciente;
    String nome_paciente;
    String endereço_paciente;
    
    //construtor
    public void Registro_paciente(){
        codigo_paciente = 0;
        telefone_paciente = 0;
        nome_paciente = "";
        endereço_paciente = "";
    }
    
    //os set
    public void setCodigo_paciente(int cod){
        codigo_paciente = cod;
    }
    public void setTelefone_paciente(int tel){
        telefone_paciente = tel;
    }
    public void setNome_paciente(String n){
        nome_paciente = n;
    }
    public void setEndereço_paciente(String end){
        endereço_paciente = end;
    }
    
    //os get
    public int getCodigo_paciente( ){
        return codigo_paciente;
    }
    public int getTelefone_paciente( ){
        return telefone_paciente;
    }
    public String getNome_paciente( ){
        return nome_paciente;
    }
    public String getEndereço_paciente( ){
        return endereço_paciente;
    }
    
}
