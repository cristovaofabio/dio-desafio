package arquivos.classes;

public class No {
    private int informacao;
    private No referenciaDoProximoNo = null;

    public No() {
    }

    public No(int informacao) {
        this.informacao = informacao;
    }

    public int getInformacao() {
        return informacao;
    }

    public void setInformacao(int informacao) {
        this.informacao = informacao;
    }

    public No getReferenciaDoProximoNo() {
        return referenciaDoProximoNo;
    }

    public void setReferenciaDoProximoNo(No referenciaDoProximoNo) {
        this.referenciaDoProximoNo = referenciaDoProximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "informacao=" + informacao +
                '}';
    }
}
