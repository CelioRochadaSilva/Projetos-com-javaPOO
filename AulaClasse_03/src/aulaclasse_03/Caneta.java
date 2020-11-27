package aulaclasse_03;
/**
 *
 * @author Celio Rocha da Silva
 */
// classe caneta caracteristica inicia com letra maiuscula.
// programação com javaPOO 
public class Caneta {
    // atributos com respectivos tipo da classe Caneta
   public String modelo;  // todos acessam
   public String cor; // todos acessam
   //private float ponta; // so quem tem autorização acessa
   private float ponta; // so quem tem autorização acessa
   protected int carga;
   protected boolean tampada; // so a clase principal e suas subclasses utilizam
   protected boolean destampada;
    
    // metodo: vem seguido com colchetes e void antes com chaves
    void status(){ // vai exibi (com AulaClasse_01) o estado (cor) do objeto com utilização da classe Caneta
        System.out.println("Qual modelo da caneta ? " + this.modelo);
        System.out.println("Qual cor da tinta da caneta ? " + this.cor); // this : auto referencia de quem chamou
        System.out.println("A caneta esta tampada ? " + this.tampada); // vai exibi se esta ou não   
        System.out.println("Qual a carga atual da caneta ? " +this.carga + "%");
        System.out.println("Que tipo de ponta ela utiliza "+ this.ponta);
        System.out.println("A ceneta esta com tampa ?" + this.destampada);
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro não posso rabiscar");
        }else{
            System.out.println("Poço rabiscar");
        }
        
    }
    public void tampar(){
       this.tampada = true; // ao executar o codigo this vai ser substituido por c1
        
    }
    protected void destampar(){
        this.destampada = false;
        
    }
    
}
