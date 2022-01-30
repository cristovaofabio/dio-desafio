package arquivos.classes;

public class No<T> {
    private T conteudo;
    private No<T> referenciaNo;

    public No(T object){
        this.conteudo = object;
        this.referenciaNo = null;
    }

    public No() {
    }

    public Object getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getReferenciaNo() {
        return referenciaNo;
    }

    public void setReferenciaNo(No referenciaNo) {
        this.referenciaNo = referenciaNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
