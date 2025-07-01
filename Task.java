public class Task {
    String descricao;
    boolean concluida;

    public Task(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    public String toString() {
        return (concluida ? "[x] " : "[ ] ") + descricao;
    }
}
