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
// classe filha: da classe Pessoa
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    // metodo
    public void CancelarMatricula(){
        System.out.println("Matricula será cancelada ");
    
}

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
