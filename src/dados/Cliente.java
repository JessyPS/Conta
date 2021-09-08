package dados;

import javax.swing.table.AbstractTableModel;

public class Cliente {
    //private: acessível comente dentro desta classe
    //alterando o Estado da classe é o mesmo que alterar o valor da classe
    private String nome;
    private String sobrenome;

    //Construtor sem parâmetros
    public Cliente (){
        this.setNome("");
        this.setSobrenome("");
    }

    // construtor com parâmetros
    public Cliente (String nome, String sobrenome) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
    }

    //Getters e setters para alterar o estado da classe
    //Trabalhar com os atributos da classe, lendo-os e alterando os seus valores de forma indireta
    //É a classe Cliente quem irá retornar e alterar o valor dos atributos para nós (Encapsulamento)
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
}
