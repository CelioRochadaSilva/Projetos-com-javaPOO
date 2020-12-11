package exerciciopolimorfismo;

/**
 *
 * @author Celio_pc
 */
public class Cachorro extends Mamifero{
   @Override
   public void emitirSom(){
       System.out.println(" Au au au");
   }
   public void reagir(String frase){
       if(frase.equals("Tomar comida")|| frase.equals("Ola")){
           System.out.println("Abanar rabo e Latir");
       }else{
           System.out.println("Rosnar");
       }
       
   }
   public void reagir(int h , int m){
       if(h<12){
           System.out.println("Abana rabo");
       }else if(h>18){
           System.out.println("Ignorar");
       }else{
           System.out.println("Aban rabo e latir");
       }
   }
   public void reagir(boolean dono){
       if(dono){
           System.out.println("Abanar rabo");
       }else{
           System.out.println("Rosnar e Latir");
   }
   
   }
   public void reagir(int idade , float peso){
       if (idade<5) {System.out.println("Abanar");
           if (peso<10) {System.out.println("Abanar");
               
           } else {System.out.println("Latir");
           }
       } else {
           if (peso<10) {System.out.println("Rosnar");
               
           } else {System.out.println("Ignorar");
           }
       }
   }
   }

