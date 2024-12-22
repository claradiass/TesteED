public class Request {
    String prioridade;
    String dados;
    public Request(String prioridade, String dados) {
        this.prioridade = prioridade;
        this.dados = dados;
    }
    public String getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
    public String getDados() {
        return dados;
    }
    public void setDados(String dados) {
        this.dados = dados;
    }
}
