
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author Celio Rocha da Silva
 */
public class Luta {
    // atributos
    private Lutador desafiado; 
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    // metodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria())&& l1!=l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            //System.out.println("");
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE###");
            this.desafiante.apresentar();
            
            // mostra resultado da luta
            System.out.println("=====Resultado da lita====");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);// vai gerar 0,1,2
            switch(vencedor){
                case 0: // empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    
                case 1: // desafiado
                    System.out.println("Vitória do" + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.pederLuta();
                    break;
                    
                case 2: // desafiante
                    System.out.println(" Vitória do "+ this.desafiante.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.pederLuta();
                    break;
                    
            } 
        }else{
            System.out.println("A luta não pode acontecer ");
        }
        
    }
    //metodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
