
package aula_animal;

/**
 *
 * @author Celio_pc
 */
public class Peixe extends Animal{
    private String CorEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    public void SolBolhas(){
        System.out.println("Soltando bolhas");
        
    }

    public String getCorEscama() {
        return CorEscama;
    }

    public void setCorEscama(String CorEscama) {
        this.CorEscama = CorEscama;
    }
    
}
