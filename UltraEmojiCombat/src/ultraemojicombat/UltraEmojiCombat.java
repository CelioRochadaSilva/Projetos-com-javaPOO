
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
       Lutador l[] = new Lutador[5]; 
      l[0] = new Lutador  ("Prettri Boy", "França" , 31 , 1.75f , 68.9f , 11, 2, 1);
        System.out.println("-------------------------------------------------------");
      l[1] = new Lutador ("Putriscrip", "Brasil", 29 , 1.68f,57.8f, 14, 2 ,3);
      l[2] = new Lutador ("Celio Rocha", "Brasil", 50 , 1.66f,70.8f, 24, 2 ,2);
      l[3] = new Lutador ("Jucilea Maria", "Brasil", 35 , 1.68f,57.8f, 14, 2 ,5);
      l[4] = new Lutador ("Matheu Vinicius", "Brasil", 30 , 1.68f,60.8f, 14, 2 ,1);
      
     // l[0].status();
    //  System.out.println("-------------------------------------------------------");
     // l[1].status();
     Luta UEC01 = new Luta();
     UEC01.marcarLuta(l[2], l[3]);
     UEC01.lutar();
     
     //System.out.println("-------------------------------------------------------");
    // l[0].status();
     //l[1].status();
        
    }
    
}
