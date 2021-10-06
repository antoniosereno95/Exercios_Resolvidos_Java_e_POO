
package questao_que_moares_me_envio_objetos_de_forma_global_no_codigo;

public class Estacionamento {
     private int codigo, qtdeVagas, horasFranquiaInicial;
    private String nome, cidade, situacao;
    private float valorFranquiaInicial, valorAdicionalHora;

    public Estacionamento(int codigo, String nome, String cidade, 
                            int qtdeVagas, int horasFranquiaInicial, 
                           float valorFranquiaInicial, 
                          float valorAdicionalHora) {
        this.codigo = codigo;
        this.qtdeVagas = qtdeVagas;
        this.horasFranquiaInicial = horasFranquiaInicial;
        this.nome = nome;
        this.cidade = cidade;
        this.valorFranquiaInicial = valorFranquiaInicial;
        this.valorAdicionalHora = valorAdicionalHora;
        this.situacao = "Desativado";
    }
    
    
    
    public void ativar(){
        if(this.situacao.equals("Desativado")){
            this.situacao = "Ativado";
        }
        else{
            System.out.println("O estacionamento já está ativo");
        }
    }
    
    public void desativar(){
        if(this.situacao.equals("Ativado")){
            this.situacao = "Desativado";
        }
        
        else{
            System.out.println("O estacionamento já está desativado");
        }
    }
 
    public int getCodigo() {
        return codigo;
    }

    public int getQtdeVagas() {
        return qtdeVagas;
    }

    public void setQtdeVagas(int qtdeVagas) {
        this.qtdeVagas = qtdeVagas;
    }

    public int getHorasFranquiaInicial() {
        return horasFranquiaInicial;
    }

    public void setHorasFranquiaInicial(int horasFranquiaInicial) {
        this.horasFranquiaInicial = horasFranquiaInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSituacao() {
        return situacao;
    }

    public float getValorFranquiaInicial() {
        return valorFranquiaInicial;
    }

    public void setValorFranquiaInicial(float valorFranquiaInicial) {
        this.valorFranquiaInicial = valorFranquiaInicial;
    }

    public float getValorAdicionalHora() {
        return valorAdicionalHora;
    }

    public void setValorAdicionalHora(float valorAdicionalHora) {
        this.valorAdicionalHora = valorAdicionalHora;
    }

    @Override
    public String toString() {
        return "Estacionamento: \nCódigo: " + this.codigo + "\nNº de vagas: " + this.qtdeVagas + 
                "\nHoras Franquia Inicial: " + this.horasFranquiaInicial + " \nNome: " + this.nome + 
                "\nCidade: " + this.cidade + "\nSituação: " + this.situacao + "\nValor Franquia Inicial: " 
                + this.valorFranquiaInicial + "\nValor Adicional Hora Excedida: " + this.valorAdicionalHora;
    }

    
   
}
