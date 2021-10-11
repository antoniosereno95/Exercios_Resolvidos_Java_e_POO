
package Aula_09b_pratica;

public class Livro implements Publicaçao {
    
    //atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }
    
    //getters and setters 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
   //metodos publicos
    public String detalhes(){
        /**###Metodo public do objeto Livro:###
         * Retorna uma STRING com as informaçoes do livro.
         * O metodo nao requer entrada.
         */
        return "Livro{" + "titulo=" + titulo + ", autor=" + 
                autor + ", totPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual + ", aberto=" +
                aberto + ", leitor=" + this.leitor.getNome() + '}';
    }
   
    //metodos abstratos da interface
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pag) {
        if(pag > this.getTotPaginas()){
            System.out.println("Error, numero de paginas acima "
                    + "do limite do livro referenciado.##limite="
                    +this.getTotPaginas()+"##");
        }else{
            this.setPagAtual(pag);
        }
    }

    @Override
    public void avançarPag() {
        this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual()-1);
    }
    
}
