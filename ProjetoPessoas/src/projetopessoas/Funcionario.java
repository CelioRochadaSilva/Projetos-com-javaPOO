/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoas;

/**
 *
 * @author Celio_pc
 */
//classe filha da classe mãe Pessoa
public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    // metodo
    public void mudarTrabalho(){
        this.trabalhando =! this.trabalhando; // vai inverter(demitido)
        
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
    
}
