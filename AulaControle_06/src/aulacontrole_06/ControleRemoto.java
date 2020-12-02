/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulacontrole_06;

/**
 *
 * @author Celio_pc
 */
public class ControleRemoto implements Controlador {
    // criação atributos da classe
    private int volume;
    private boolean ligado;
    private boolean tocando;
    // metodo especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
        
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    // criação metodos abstratos

    @Override
    public void ligar(){
        this.setLigado(true);
    }

    @Override
    public void desligar(){
        this.setLigado(false);
    }

    @Override
    public void abriMenu(){
        System.out.println("Esta ligado "+ this.getLigado());
        System.out.println("Esta tocando "+ this.getTocando());
        System.out.print("Volume " + this.getVolume());
        for(int i= 0;i<= this.getVolume() ; i+=10 ) // vai imprementar
            System.out.print("|"); // vai mostra mais barra de acordo co volume
        System.out.println("");
    }

    @Override
    public void fecharMenu(){
        System.out.println("Fechando menu ...");
    }

    @Override
    public void maisVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("Impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume()>0){
           this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Não conseguir reproduzir");
        }
    }

    @Override
    public void pause(){
        if(this.getLigado() && (this.getTocando())){
            this.setTocando(false);
            System.out.println("Esta pausado");
        }else{
            System.out.println("Não conseguir pausar");
        }
    }
            
}
