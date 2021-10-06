
package Exercicio_11;

public class Registro_consultas{
    
    int numero_prontuario;
    String data_consulta;
    String diagnostico;
    int codigo_medico;
    int codigo_paciente;
    
    //contrutor
    public void Registro_consultas(){
        numero_prontuario = 0;
        data_consulta = "";
        diagnostico = "";
        codigo_medico = 0;
        codigo_paciente = 0;
    }
    
    //os set
    public void setNumero_prontuario(int pront){
        numero_prontuario = pront;
    }
    public void setData_consulta(String data){
        data_consulta = data;
    }
    public void setDiagnostico(String diag){
        diagnostico = diag;
    }
    public void setCodigo_medigo(int cod){
        codigo_medico = cod;
    }
    public void setCodigo_paciente(int cod_p){
        codigo_paciente = cod_p;
    }
    
    //os get
    public int getNumero_prontuario(){
        return numero_prontuario ;
    }
    public String getData_consulta(){
        return data_consulta ;
    }
    public String getDiagnostico(){
        return diagnostico ;
    }
    public int getCodigo_medigo(){
        return codigo_medico ;
    }
    public int getCodigo_paciente(){
        return codigo_paciente ;
    }
    
}
