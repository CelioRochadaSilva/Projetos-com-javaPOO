/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoa_02;

/**
 *
 * @author Celio_pc
 */
public abstract class Pessoa {
    protected String nome;
    protected String sexo;
    protected int idade;
    
    // metodo
    public void fazerAniversario(){
        this.idade++;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome: " + nome + ", sexo: " + sexo + ", idade: " + idade + " anos"+ '}';
    }
    
    
}
