import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar cliente e criar contas");
            System.out.println("2. Consultar clientes cadastrados");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    
                    Cliente cadastrado = new Cliente();
                    cadastrado.setNome(nomeCliente);

                    banco.adicionarCliente(cadastrado); 
                    
                    Conta cc = new ContaCorrente(cadastrado);
                    cc.depositar(100); 
                    banco.getContas().add(cc); 

                    
                    Conta poupanca = new ContaPoupanca(cadastrado);
                    banco.getContas().add(poupanca); 

                    System.out.println("Cliente e contas cadastrados com sucesso!");
                    break;

                case 2:
                    System.out.println("\nClientes cadastrados:");
                    for (String nome : banco.getNomesClientes()) {
                        System.out.println(nome);
                    }
                    break;

                case 3:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
