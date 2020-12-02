package aulacontrole_06;

/**
 *
 * @author Celio_pc
 */
public interface Controlador {
    // metododo abstrado criação da interface
    public abstract void ligar();
    public  abstract void desligar();
    public abstract void abriMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
    
}
