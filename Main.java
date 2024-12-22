public class Main {
    public static void main(String[] args) {
        TQueue fila = new TQueue();

        fila.enfileirar("alta", "Solicitacao 1");
        fila.enfileirar("media", "Solicitacao 2");
        fila.enfileirar("baixa", "Solicitacao 3");
        fila.enfileirar("alta", "Solicitacao 4");
        fila.enfileirar("media", "Solicitacao 5");
        fila.enfileirar("baixa", "Solicitacao 6");

        System.out.println("Número de solicitações na fila: " + fila.tamanhoDaFila());

        Request req = fila.desenfileirar();
        if (req != null) {
            System.out.println("Removida solicitação com prioridade " + req.getPrioridade() + " e dados: " + req.getDados());
        }

        req = fila.desenfileirar();
        if (req != null) {
            System.out.println("Removida solicitação com prioridade " + req.getPrioridade() + " e dados: " + req.getDados());
        }

        req = fila.desenfileirar();
        if (req != null) {
            System.out.println("Removida solicitação com prioridade " + req.getPrioridade() + " e dados: " + req.getDados());
        }

        req = fila.desenfileirar();
        if (req != null) {
            System.out.println("Removida solicitação com prioridade " + req.getPrioridade() + " e dados: " + req.getDados());
        }

        req = fila.desenfileirar();
        if (req != null) {
            System.out.println("Removida solicitação com prioridade " + req.getPrioridade() + " e dados: " + req.getDados());
        }
    }
}
