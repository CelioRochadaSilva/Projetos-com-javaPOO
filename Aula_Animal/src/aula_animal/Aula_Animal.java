
package aula_animal;

/**
 *
 * @author Celio Rocha d Silva
 */
public class Aula_Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Animal an1 = new Animal(); não funciona classe é abstrata nao pode ser instanciada
       Reptil r = new Reptil();
       Peixe p = new Peixe();
       Ave a = new Ave();
       Canguru c = new Canguru();
       //Mamifero m = new Mamifero();
       Cachorro k = new Cachorro();
       Cobra j = new Cobra();
       Tartaruga t = new Tartaruga();
       GoldFish g = new GoldFish();
       
      // a.locomover();
       c.locomover();
       k.locomover();
       
    }
    
}
