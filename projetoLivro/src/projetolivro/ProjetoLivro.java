
package projetolivro;

/**
 *
 * @author Celio Rocha da Silva
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        // 1 pessoa
        p[0] = new Pessoa("Celio" ,50  , "M");
        p[1] = new Pessoa("Jucilea ", 40 , "F");
        
        l[0] = new Livro("Use a Cabeça Java " ," Auguste Cure", 300 , p[0]);
        l[1] = new Livro("Use a Cabeça Python " ," Roberto Carlos", 400 , p[1]);
        l[2] = new Livro("Use a Cabeça JavaScript " ," Toyn Ramos", 850 , p[0] );
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
    }
    
}
