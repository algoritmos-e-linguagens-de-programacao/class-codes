package aula;

class Pessoa {

    private String nome;
    private int idade;

    /**
     * Construtor da classe Pessoa
     */
    Pessoa(){

    }

    /**
     * Construtor da classe Pessoa com um argumento
     * @param nome
     */
    Pessoa(String _nome){
        nome = _nome;        
    }

    /**
     * Construtor da classe Pessoa com dois argumentos
     * 
     * @param nome String - Nome completo da Pessoa
     * @param idade int - Idade 
     */
    Pessoa(String _nome, int _idade){
        nome = _nome;
        idade = _idade;
    }

    /**
     * Função que retorna o atributo nome
     *
     * @return String nome
     */
    String getNome(){
        return nome;
    }

    /**
     * Função para trocar o nome da Pessoa, apenas se o
     * a idade for maior ou igual que 18.
     * 
     * @param novoNome
     */
    void trocarNome(String novoNome){
        if(idade >= 18) nome = novoNome;
    }

}
