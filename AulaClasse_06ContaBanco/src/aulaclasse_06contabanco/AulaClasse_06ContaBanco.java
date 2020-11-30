package aulaclasse_06contabanco;

/**
 *
 * @author Celio Rocha da Silva 30/11/2020
 */
public class AulaClasse_06ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----------------------");
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("CP");
        p1.setNumConta(11111111); // número conta
        p1.setDono("Celio Rocha"); // dono da conta
        p1.setTipo("CP");
        p1.depositar(200);
        p1.sacar(100);
        p1.pagarMensal();
        p1.Status();
                 
        
       
       System.out.println("----------------------");
       ContaBanco p2 = new ContaBanco();
       p2.abrirConta("CC");
       p2.setNumConta(12345);
       p2.setTipo("CC");
       p2.setDono("Jucilea");
       p2.depositar(150);
       p2.sacar(100);
       p2.Status();
    }
    
}
