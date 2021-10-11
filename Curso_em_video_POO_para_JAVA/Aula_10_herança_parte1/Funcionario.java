
package Aula_10_herança_parte1;

public class Funcionario extends Pessoa{
    
    private String setor;
    private boolean trabalhando;

    public Funcionario() {
        this.setor = "";
        this.trabalhando = false;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
    
    //metodos

   public void apresentaçao(){
       System.out.println(this.getNome());
       System.out.println(this.getIdade());
       System.out.println(this.getSetor());
       System.out.println(this.getTrabalhando());
       
   }
    
    
}
