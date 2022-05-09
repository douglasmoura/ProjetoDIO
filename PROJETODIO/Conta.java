package PROJETODIO;

public abstract class Conta implements InterfaceConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
   protected int agencia;
   protected int numero;
   protected double saldo;
   protected Cliente cliente;
   

protected void imprimirInformacoes() {

    System.out.println(String.format("~~~~ Extrato  ~~~~"));
    System.out.println(String.format("Agência: %d", agencia));
    System.out.println(String.format("Titular: %s", cliente.getNome()));
    System.out.println(String.format("Número: %d",numero));
    System.out.println(String.format("Saldo: %.2f",saldo));
}

public Conta(Cliente cliente){
      this.agencia = Conta.AGENCIA_PADRAO;
      this.numero = SEQUENCIAL++;
      this.cliente = cliente;
   }

   @Override
   public void sacar(double valor) {
       this.saldo -= valor;
   }
       
   
   @Override
   public void depositar(double valor) {
        this.saldo += valor;
   }
       
   
   @Override
   public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }
       
   
   
   public int getAgencia() {
      return agencia;
   }

   public int getNumero() {
      return numero;
   }
 
   public double getSaldo() {   
      return saldo;
   }


}

