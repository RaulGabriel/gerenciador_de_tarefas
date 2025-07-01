import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        ArrayList<Task> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n📋 Gerenciador de Tarefas");
            System.out.println("[1] Adicionar tarefa");
            System.out.println("[2] Listar tarefas");
            System.out.println("[3] Marcar tarefa como concluída");
            System.out.println("[4] Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String desc = scanner.nextLine();
                    tarefas.add(new Task(desc));
                    System.out.println("✅ Tarefa adicionada!");
                    break;
                case 2:
                    System.out.println("\n📃 Tarefas:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Número da tarefa para marcar como concluída: ");
                    int numero = scanner.nextInt();
                    if (numero >= 1 && numero <= tarefas.size()) {
                        tarefas.get(numero - 1).marcarComoConcluida();
                        System.out.println("✅ Tarefa marcada como concluída.");
                    } else {
                        System.out.println("❌ Número inválido.");
                    }
                    break;
                case 4:
                    System.out.println("👋 Saindo...");
                    break;
                default:
                    System.out.println("❌ Opção inválida.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
