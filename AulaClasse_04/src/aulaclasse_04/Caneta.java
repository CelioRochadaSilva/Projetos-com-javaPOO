/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaclasse_04;

/**
 *
 * @author Celio Rocha da Silva 27/11/2020
 */
public class Caneta {
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    // metodo construtor identifica-se-o por que ele tem o mesmo nome da classe
    public void Caneta(){
        this.tampar();
        this.cor = "Azul";
}
    
    public String getModelo(){
       return this.getModelo();
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
        
              
    }
    public void destampa(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.modelo);
       // System.out.println("Modelo: " + this.getModelo());
        //System.out.println("Ponta: " + this.ponta);
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor" + this.cor);
        System.out.println("Tampada " + this.tampada);
    }
    
}
