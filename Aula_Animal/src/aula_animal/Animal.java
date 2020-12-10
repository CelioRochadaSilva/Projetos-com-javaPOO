
package aula_animal;

/**
 *
 * @author Celio_pc
 */
public abstract class Animal {
    // atributos abstrato animal
    protected float peso;
    protected int idade;
    protected String menbro;
    // metodo
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMenbro() {
        return menbro;
    }

    public void setMenbro(String menbro) {
        this.menbro = menbro;
    }
    
    
    
}
