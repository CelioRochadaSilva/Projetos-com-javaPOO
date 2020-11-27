package aulaclasse_03;

/**
 *
 * @author Celio_pc
 */
public class AulaClasse_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // utilizando classe Caneta do outro arquivo java esta no mesmo pacote
       // criação novo objeto c1 instanciado
       Caneta c1 = new Caneta();
       // adicionando os atributos do objeto
       c1.modelo = "Bik Cristal";
       c1.cor = "Preta";
       //c1.ponta = 0.5f;
       c1.carga = 10; // pode ser utilizado por que esta dentro de main
       //c1.tampada = true; // pode ser utilizado por que clase esta dentro de main
       c1.status();
       c1.rabiscar();
       c1.destampar();
    
  
    }
     
}
