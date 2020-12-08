
package projetopessoas;

/**
 *
 * @author Celio Rocha da Silva 07/12/2020
 */
public class ProjetoPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // programa principal
       Pessoa p1 = new Pessoa();
       
       Aluno p2 = new Aluno();
       
       Professor p3 = new Professor();
       
       Funcionario p4 = new Funcionario();
       
       p1.setNome("Pedro");
       p1.setSexo("M");
       p1.setIdade(20);
       
       p2.setNome("Celio");
       p2.setSexo("M");
       p2.setCurso("Full Track");
       p2.setIdade(50);
       
       p3.setNome("Jucilea ");
       p3.setSexo("F");
       p3.setSalario(1.500f);
       
       p4.setNome("Matheus");
       p4.setSexo("M");
       p4.setTrabalhando(true);
       p4.setSetor("Administrativo");
       
       
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
      
        
    }
    
}
