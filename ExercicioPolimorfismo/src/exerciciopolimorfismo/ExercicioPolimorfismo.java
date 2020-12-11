package exerciciopolimorfismo;

/**
 *
 * @author Celio Rocha da Silva
 */
public class ExercicioPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Mamifero x = new Mamifero();
       // x.emitirSom();
        
      //  Lobo b = new Lobo();
       // b.emitirSom();
        
        Cachorro c = new Cachorro();
        c.emitirSom();
        c.reagir("Ola");
        c.reagir(10, 45);
        c.reagir(true);
        c.reagir(false);
        
    }
    
}
