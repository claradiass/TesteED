public class TQueue {
    private Node frente;
    private Node tras;
    private int contagem;

    public TQueue() {
        this.frente = null;
        this.tras = null;
        this.contagem = 0;
    }

    private int compararPrioridade(String p1, String p2) {
        int prioridade1 = converterPrioridade(p1);
        int prioridade2 = converterPrioridade(p2);
        return Integer.compare(prioridade1, prioridade2);
    }

    private int converterPrioridade(String prioridade) {
        switch (prioridade.toLowerCase()) {
            case "alta":
                return 1;
            case "media":
                return 2;
            case "baixa":
                return 3;
            default:
                return Integer.MAX_VALUE;
        }
    }

    public void enfileirar(String prioridade, String dados) {
        Request req = new Request(prioridade, dados);
        Node novoNo = new Node(req);

        // 1, 2
        if (frente == null) {
            frente = novoNo;
            tras = novoNo;
        } else {
            Node atual = frente;
            Node anterior = null;

            while(atual != null && compararPrioridade(atual.solicitacao.getPrioridade(), prioridade) <= 0){
                anterior = atual;
                atual = atual.proximo;
            }

            // Se o 'anterior' ainda for null, isso significa que o novo nó deve ser inserido na frente da fila
            if (anterior == null) {
                // O próximo nó do novo nó será a frente atual
                novoNo.proximo = frente;
                // O novo nó se torna a nova frente da fila
                frente = novoNo;
            } else if (atual == null) {
                // Se 'atual' for null, significa que percorremos até o final da fila
                // Então, o novo nó é inserido no final da fila
                tras.proximo = novoNo;
                // O novo nó se torna o novo final da fila
                tras = novoNo;
                
            } else {
                // Caso contrário, o novo nó é inserido entre 'anterior' e 'atual'
                // O próximo nó do 'anterior' será o novo nó
                anterior.proximo = novoNo;
                // O próximo nó do novo nó será o 'atual'
                novoNo.proximo = atual;
            }
        }

        contagem ++;


    }

    public Request desenfileirar() {
        if (frente == null) {
            System.out.println("A fila está vazia.");
            return null;
        } else {
            // Cria uma variável temporária que armazena o nó atualmente na frente da fila
            Node temp = frente;
            // Extrai a solicitação do nó armazenado em temp
            Request req = temp.solicitacao;
            // Atualiza a frente da fila para o próximo nó
            frente = frente.proximo;
            // Se a fila ficou vazia após a remoção, também define o final da fila como null
            if (frente == null) {
                tras = null;
            }
            // Decrementa o contador de elementos na fila
            contagem--;
            // Retorna a solicitação que foi removida da frente da fila
            return req;
        }
    }

    public int tamanhoDaFila() {
        return contagem;
    }

    
}
