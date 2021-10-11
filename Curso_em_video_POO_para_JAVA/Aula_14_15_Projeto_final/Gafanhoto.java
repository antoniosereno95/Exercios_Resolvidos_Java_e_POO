
package Aula_14_15_Projeto_final;

public class Gafanhoto extends Pessoa{
    
    private String login;
    private double totAssistido;
    
    @Override
    protected void ganharExp() {
        
    }
    
    //metodos
    public void viuMaisUm(){
        
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
        //super.toString() chama o tString da superClasse de Gafanhoto, no caso Pessoa.
    }

    //get and set
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(double totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    //contrutor

    public Gafanhoto(String login, double totAssistido, String nome, int idade, char sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    
}
