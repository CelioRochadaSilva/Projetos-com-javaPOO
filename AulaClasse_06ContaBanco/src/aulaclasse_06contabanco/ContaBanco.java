package aulaclasse_06contabanco;

/**
 *
 * @author Celio_pc
 */
public class ContaBanco {
    // atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo; 
    private boolean status;
    
   // public void estadoAtual(){
    //    System.out.println("---------------------------");
    //    System.out.println("Conta: " +this.getNunConta());
     //   System.out.println("Tipo conta "+this.getTipo());
    //    System.out.println(" " +this.getDono());
    //    System.out.println("Saldo: " +this.getSaldo());
    //    System.out.println("Estatos da conta: " +this.getStatus());
   // }
    // metodos personalizados
public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true); // metodo modificador
    if (t == "CC") {
       // this.saldo = 50; // se for conta poupança
        this.setSaldo(50);
        System.out.println("Conta poupança aberta com sucesso ");
        System.out.println("Saldo R$ "+ this.saldo);
    }else if(t == "CP"){
        //this.saldo = 150; // se for conta corrente
        this.setSaldo(150);
        System.out.println("Conta corrente aberta com sucesso ");
        System.out.println("Saldo: R$ "+this.saldo);
    }     
}   
public void fecharConta(){
    if(this.getSaldo()>0){
        System.out.println(" Essa conta não pode se encerrada: tem saldo");
     }else if(this.getSaldo()<0) {
         System.out.println("Conta não pode encerrada, pois tem debito");
      }else{
         this.setStatus(false);
         System.out.println("Conta encerrada com sucesso !");
      }
}
public void depositar(float v){
    if(this.getStatus()){
       this.setSaldo(this.getSaldo()+v);
        System.out.println("Deposito realizado por: " +this.getDono()+ ", Valor final R$ "+ this.saldo);
        
     }else{
        System.out.println("Impossivel depositar: conta fechada");
    }
    }
    
public void sacar(float v){
    if (this.getStatus()) {
        if (this.getSaldo()>= v) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado na conta de " + this.getDono());
            System.out.println("Saldo R$ "+ this.saldo);
         }else{
            System.out.println("Salo insuficiente para saque ! ");
        }
    }else{
        System.out.println("Impossivel sacar : conta fechada");
    }
    
}
public void pagarMensal(){
    int v = 0;
    if (this.getTipo() == "CC") {
        v = 12;
    } else if(this.getTipo()=="CP"){
        v = 20;
    }
    if (this.getStatus()){
        this.setSaldo(this.getSaldo() - v);
        System.out.println("Mensalidade paga com sucesso por: "+ this.getDono());
        System.out.println("Saldo atualizado R$ " +saldo);
        
    }else{
        System.out.println("Impossivel pagar: conta fechada");
    }   
}
// metodos especiais

    public ContaBanco() {
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return  saldo;
        
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
        System.out.println(status);
    }

    public boolean Status() {
        return status;
    }
    
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(String NunConta) {
        this.numConta = numConta;
    }

    private String getNunConta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      
}
