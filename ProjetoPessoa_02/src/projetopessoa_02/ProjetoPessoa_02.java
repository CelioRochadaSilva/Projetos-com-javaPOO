
package projetopessoa_02;

/**
 *
 * @author Celio Rocha da Silva
 */
public class ProjetoPessoa_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // app principla
       //Visitante  v1 = new Visitante();
      // v1.setNome("Celio");
      // v1.setIdade(50);
      // v1.setSexo("M");
      // v1.fazerAniversario();
     //  System.out.println(v1.toString()); // mostra todo conteudo solicitado
       
      //  System.out.println("---------------------------");
       
       Aluno a1 = new Aluno();
       a1.setNome("João");
       a1.setSexo("M");
       a1.setIdade(34);
       a1.setMatricula(1233);
       a1.setCurso("Computação");
       System.out.println(a1.toString());
       a1.pagarMensalidade();
       System.out.println(a1.toString());
       
       Bolsista b1 = new Bolsista();
       b1.setMatricula(12345556);
       b1.nome = ("Jubileu");
       b1.setBolsa(7.1f);
       b1.setCurso("ADS");
       b1.sexo = ("M");
       b1.PagarMensalidade();
       
    }
    
}
