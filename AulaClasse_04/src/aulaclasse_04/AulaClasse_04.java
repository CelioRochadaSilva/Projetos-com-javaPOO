/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaclasse_04;

/**
 *
 * @author Celio_pc
 */
public class AulaClasse_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.setPonta(0.1f); // metodo acesso
       // c1.modelo= "Bick"; // metodo direto do atributo
        c1.setModelo("Bick");
        // c1.ponta = 0.05f; essa linha da erro por que atributo ponta e privado e não pode ser acesssado diretamente
        c1.status();
    }
    
}
