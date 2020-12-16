
package projetovideos;

/**
 *
 * @author Celio_pc
 */
public class Gafanhoto extends Pessoa{
    private String Login;
    private int TotAssistido;

    public Gafanhoto(String nome, int idade, String sexo , String Login ) {
        super(nome, idade, sexo);
        this.Login = Login;
        this.TotAssistido = 0;
    }
    
    

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public int getTotAssistido() {
        return TotAssistido;
    }

    public void setTotAssistido(int TotAssistido) {
        this.TotAssistido = TotAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\n Login=" + Login + ", TotAssistido=" + TotAssistido + '}';
    }
    
    
}
