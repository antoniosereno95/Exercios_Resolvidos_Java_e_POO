
package Aula_06_Encapsulamento;

public class Aula_06_MAIN {
    public static void main(String[] args){
        //passo a passo do como encapsular um programinha.:
        
        //1. criar um arquivo java interface :
        //1.1 criar os metodos abstratos dentro da interface.
        
        //2. criar um arquivo java que sera o objeto:
        //2.1 colocar as variaveis ou atributos.
        //2.2 criar o contrutor e os getters e setters dos atrubutos.
        //2.3 colocar "implements -nome_da_interface-".
        //2.4 vai dar erro e la no erro vai ter a opçao inserir os
        //metodos abstratos no arquivo java do objeto.
        //2.5 retirar as excessoes criadas dentro dos metodos 
        //que ligam o objeto a interface.
        //2.6 colocar os programas dentro dos metodos abstratos
        //3. criar o objeto enclausulado dentro do Main - cria igual
        //como se define o Scanner dentro do main
        //3.1 utilizar os metodos que estao na interface para 
        //modificar o objeto, *lembrar de colocar os get e os set do 
        //objeto como Private para eles nao aparecerem como disponiveis
        //no main, pq se nao, nao faz sentido o enclausuramento do objeto.
        //FIM;
        
        //inicio do main:
        //contruir meu obejto, que vou chamar de "c"
        ControleRemoto c = new ControleRemoto();
        
        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.menosVolume();
        
        c.abrirMenu();
        c.fecharMenu();
        
    }
}
