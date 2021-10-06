
package Exercicio_11;

public class Registro_pacientes {
    
    int codigo_paciente;
    String nome_paciente;
    String endereço_paciente;
    int idade_paciente;
    
    //construtor
    public void Registro_pacientes(){
        codigo_paciente = 0;
        nome_paciente = "";
        endereço_paciente = "";
        idade_paciente = 0;
    }
    
    //os set
    public void setCodigo_paciente(int cod){
        codigo_paciente = cod;
    }
    public void setNome_paciente(String nome){
        nome_paciente = nome;
    }
    public void setEndereço_paciente(String end){
        endereço_paciente = end;
    }
    public void setIdade(int id){
        idade_paciente = id;
    }
    
    //os get
    public int getCodigo_paciente(){
        return codigo_paciente;
    }
    public String getNome_paciente(){
        return nome_paciente;
    }
    public String getEndereço_paciente(){
        return endereço_paciente;
    }
    public int getIdade(){
        return idade_paciente;
    }
    
}
