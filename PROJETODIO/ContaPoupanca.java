package PROJETODIO;

public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        imprimirInformacoes();
        }
}
