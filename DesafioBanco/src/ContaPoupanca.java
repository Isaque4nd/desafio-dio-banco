public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente2) {
        super(cliente2);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        imprimirInfosComuns();
    }
    
 
}
