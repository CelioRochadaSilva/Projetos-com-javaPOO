
package projetovideos;

/**
 *
 * @author Celio_pc
 */
public class ProjetoVideos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3]; 
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aua 12 PHP");
        v[2] = new Video("Aula 19 HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Celio", 22, "M", "Rocha");
        g[1] = new Gafanhoto("Eva", 12, "F", "Evann");
        System.out.println(g[0]);
        
        
        System.out.println(v[0].toString());
    }
    
}
