import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("=== SISTEMA DE CONTROLE DE DESPESAS ===");
            System.out.println("1. Entrar Despesa");
            System.out.println("2. Anotar Pagamento");
            System.out.println("3. Listar Despesas em Aberto no período");
            System.out.println("4. Listar Despesas Pagas no período");
            System.out.println("5. Gerenciar Tipos de Despesa");
            System.out.println("6. Gerenciar Usuários");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 selecionada: Entrar Despesa");
                    break;
                case 2:
                    System.out.println("Opção 2 selecionada: Anotar Pagamento");
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada: Listar Despesas em Aberto");
                    break;
                case 4:
                    System.out.println("Opção 4 selecionada: Listar Despesas Pagas");
                    break;
                case 5:
                    System.out.println("Opção 5 selecionada: Gerenciar Tipos de Despesa");
                    break;
                case 6:
                    System.out.println("Opção 6 selecionada: Gerenciar Usuários");
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println();
        } while (opcao != 7);

        sc.close();
    }
}
