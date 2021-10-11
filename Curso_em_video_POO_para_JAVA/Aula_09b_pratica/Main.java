
package Aula_09b_pratica;

public class Main {
    public static void main(String args[]) {
        
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("pedro",22,'M');
        p[1] = new Pessoa("maria",25,'F');
        
        l[0] = new Livro("Aprendendo java","jose",300,p[0]);
        l[1] = new Livro("POO para iniciantes", "pedro paulo", 500, p[1]);
        l[2] = new Livro("java avançado", "maria candido", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(250);
        System.out.println(l[0].detalhes());
        
    }
}
