package PROJETODIO;

public class ContaCorrente extends Conta{   

public ContaCorrente(Cliente cliente) {
      super(cliente);
   }

@Override
public void imprimirExtrato() {
   imprimirInformacoes();
}
  
}
