
package ultraemojicombat;

/**
 *
 * @author Celio Rocha da Silva
 */
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Lutador l[] = new Lutador[6]; 
      l[0] = new Lutador  ("Prettri Boy", "França" , 31 , 1.75f , 68.9f , 11, 2, 1);
        System.out.println("-------------------------------------------------------");
      l[1] = new Lutador ("Putriscrip", "Brasil", 29 , 1.68f,57.8f, 14, 2 ,3);
      
      l[0].status();
      System.out.println("-------------------------------------------------------");
      l[1].status();
        
    }
    
}
