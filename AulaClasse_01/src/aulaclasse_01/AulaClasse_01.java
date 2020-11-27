package aulaclasse_01;

/**
 *
 * @author Celio_pc
 */
public class AulaClasse_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // utilizando classe Caneta do outro arquivo java esta no mesmo pacote
       // criação novo objeto c1 instanciado
       Caneta c1 = new Caneta();
       // adicionando os atributos do objeto
       c1.cor = "Azul";
       //c1.ponta = 0.1f; //sem aspa porque atributo para  numero real.
       c1.modelo = "Bick"; // desclição fabricante
       c1.carga = 50;
       c1.tampar(); // true ou false vai depender da situação do objeto 
       c1.status(); // vai mostra o texto com respectiva cor
       c1.rabiscar(); // valor logico
       
       // criação novo objeto c2 instanciado com reutilização da classe Caneta e seus atributos e metodos
        System.out.println(" -----------------------");
      Caneta c2 = new Caneta();  
       c2.cor = "Vermelha";
       //c2.ponta = 0.7f; //sem aspa porque atributo para  numero real.
       c2.modelo = "Balsane "; // desclição fabricante
       c2.carga = 60;
       c2.status(); // vai mostra o texto com respectiva cor
       c2.destampar(); // valor logico
       c2.rabiscar();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
      
       Caneta c3 = new Caneta();
       c3.cor = "Preta";
       
      // c3.ponta = 0.9f; //sem aspa porque atributo para  numero real.
       c3.modelo = "Bick Cristal "; // desclição fabricante
       c3.carga = 20;
       c3.status(); // vai mostra o texto com respectiva cor
       c3.tampar(); // valor logico
       c3.rabiscar();
    }
     
}
