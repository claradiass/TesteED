public class Node {
    Request solicitacao ;
    Node proximo;

    public Node(Request solicitacao) {
        this.solicitacao = solicitacao;
        this.proximo = null;
    }

    public Request getSolicitacao() {
        return solicitacao;
    }
    public void setSolicitacao(Request solicitacao) {
        this.solicitacao = solicitacao;
    }
    public Node getProximo() {
        return proximo;
    }
    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

}
