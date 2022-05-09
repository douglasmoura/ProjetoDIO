package PROJETODIO;

public class Main {

    public static void main(String[] args) {

        Cliente Douglas = new Cliente();
        Douglas.setNome("Douglas");

        Conta cc = new ContaCorrente(Douglas);
        
        Conta poupanca = new ContaPoupanca(Douglas);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
    }
    
}
