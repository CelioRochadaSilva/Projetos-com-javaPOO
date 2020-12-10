
package projetopessoa_02;

/**
 *
 * @author Celio_pc
 */
public class Bolsista extends Aluno{
    private float bolsa;
    
    // metodo
    public void RenovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
        
    }
    //@Override 
    public void PagarMensalidade(){
        System.out.println(this.nome + "é bolsita pagamento facilitado");
        
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
