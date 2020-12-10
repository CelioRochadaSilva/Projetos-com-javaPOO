
package aula_animal;

/**
 *
 * @author Celio_pc
 */
public class Ave extends Animal{
    private String CorPena;

    @Override
    public void locomover() {
        System.out.println("Voando ");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer frutas ");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave ");
    }
    public void fazerNinho(){
        System.out.println(" Construindo ninho");
    }

    public String getCorPena() {
        return CorPena;
    }

    public void setCorPena(String CorPena) {
        this.CorPena = CorPena;
    }
    
    
}
