package exerciciopolimorfismo;

/**
 *
 * @author Celio_pc
 */
public class Mamifero extends Animal{
    // atributos
    protected String CorPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
    
}
