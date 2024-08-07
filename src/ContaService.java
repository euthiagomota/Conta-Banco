import java.util.Scanner;

public class ContaService {

    public static void criarConta() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Bem-vindo(a) ao nosso banco, por favor informe seu nome: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                System.out.println("O nome não pode ser vazio.");
                criarConta();
            } else {
                System.out.println("Agora digite sua agencia: ");
                String agencia = scanner.nextLine();
                if (agencia.isEmpty()) {
                    System.out.println("A agencia não deve ser vazia.");
                } else {
                    System.out.println("Digite o numero da conta: ");
                    int numero = scanner.nextInt();

                    System.out.println("Digite seu saldo atual: ");
                    double saldo = scanner.nextDouble();

                    ContaModel contaModel = new ContaModel(agencia, saldo, numero, name);

                    System.out.println("Conta criada com sucesso! " + "\n" +
                            "Nome: " + contaModel.getNome() + "\n" +
                            "Agência: " + contaModel.getAgencia() + "\n" +
                            "Numero: " + contaModel.getNumero() + "\n" +
                            "Saldo: " + contaModel.getSaldo());
                }
            }

        } catch (Exception exception) {
            System.out.println("Ops! Algo deu errado na criação da sua conta, tente novamente.");
            criarConta();
        }
    }
}
