public class App {
    public static void main(String[] args) throws Exception {
        Cliente cadastrado = new Cliente();
        cadastrado.setNome("Isaque");


        Conta cc = new ContaCorrente(cadastrado);
        cc.depositar(100);
        cc.imprimirExtrato();

        Conta poupanca = new ContaPoupanca(cadastrado);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
