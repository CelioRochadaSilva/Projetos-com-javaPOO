package aulacontrole_06;

/**
 *
 * @author Celio Rocha da Silva
 */
public class AulaControle_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
       System.out.println("------------Menu----------");
       c.ligar();
       c.play();
       c.maisVolume();
       c.abriMenu();
       //c.pause();
       //c.fecharMenu();
       
    }
    
}
