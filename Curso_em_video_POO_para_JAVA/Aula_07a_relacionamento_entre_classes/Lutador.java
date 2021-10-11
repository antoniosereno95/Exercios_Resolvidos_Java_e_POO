
package Aula_07a_relacionamento_entre_classes;

public class Lutador {
    
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    /*
    //construtor
    public Lutador(){
        this.nome="";
        this.nacionalidade = "";
        this.idade = 0;
        this.altura = 0.0;
        this.peso = 0.0;
        this.categoria = "";
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }
    */
    //construtor automatico
    //para este exercicio, para facilitar o cadastaramento dos lutadores
    //usaremos um metodo que recebe parametros, desse jeito ao iniciar
    //um objeto Lutador, ja iremos dar todas as informaçoes do mesmo,
    //oq basicamente vai fazer que pulemso a parte do registro.
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        //usamos o metodo set aqui pro peso, pro valor ja ir direto
        //pro metodo pois dentro do metodo setPeso a gente ja vai fazer 
        //o calculo para poder categorizar o lutador, oq vai nos ajudar
        //pois sem o metodo set aqui, o lutador somente seria categorizado
        //se a gente depois do cadastro, chamasse o metodo getter.
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria(peso);
        //desse jeito toda vez que a gente der um setter no peso
        //tambem vamos mudar junto a categoria do lutador.
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(double peso) {
        //aqui faremos a diferenciaçao dos pesos para colocar o
        //lutador dentro de sua categoria especifica.
        if(peso < 52.2){
            categoria = "Invalido";
        }else if(/*peso >=52.2 &&*/ peso <=70.3 ){
            //o elseif ja faz o trabalho de verificaçao da menor
            //faixa de peso. logo, nao precisa verificar denovo.
            categoria = "Leve";
        }else if(peso <= 83.9){
            categoria = "Medio";
        }else if(peso <= 120.2){
            categoria = "Pesado";
        }else{
           categoria = "Invalido";
        }
        
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //metodos abstratos
    public void apresentar(){
        System.out.println("--------------------------------------------");
        System.out.println("Apresentando o Lutador: "+this.getNome());
        System.out.println("Origem: "+this.getNacionalidade());
        System.out.print("com "+this.getIdade()+" anos e ");
        System.out.println(this.getAltura()+" metros de altura");
        System.out.println("Pesando "+this.getPeso()+" Kg");
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Perdeu: "+this.getDerrotas());
        System.out.println("Empatou: "+this.getEmpates());
        System.out.println("--------------------------------------------");
    }
    
    public void Status(){
        System.out.println("--Status--");
        System.out.print(this.getNome()+" é um peso ");
        System.out.print(this.getCategoria()+" com ");
        System.out.print(this.getVitorias()+" vitorias, ");
        System.out.print(this.getDerrotas()+" derrotas, ");
        System.out.println(this.getEmpates()+" empates.");
        System.out.println("----------");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() +1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() +1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() +1);
    }
   
    
}
