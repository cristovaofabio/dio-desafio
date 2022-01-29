package arquivos.classes;

public class Pilha {
    private No refenciaDoNoQueEntrouNaPilha = null;

    public Pilha() {
    }

    public No top(){
        return refenciaDoNoQueEntrouNaPilha;
    }

    public No pop(){
        if(!this.isEmpty()){
            No noRetirado = refenciaDoNoQueEntrouNaPilha;
            refenciaDoNoQueEntrouNaPilha = refenciaDoNoQueEntrouNaPilha.getReferenciaDoProximoNo();
            return noRetirado;
        }
        return null;
    }

    public void push(No novoNo){
        No noAuxiliar = refenciaDoNoQueEntrouNaPilha;
        refenciaDoNoQueEntrouNaPilha = novoNo;
        refenciaDoNoQueEntrouNaPilha.setReferenciaDoProximoNo(noAuxiliar);
    }

    public boolean isEmpty(){
        return refenciaDoNoQueEntrouNaPilha ==null;
    }

    @Override
    public String toString() {
        String mensagem = "-------------------\n";
        mensagem+="    Pilha\n";
        mensagem+="-------------------\n";

        No noAuxiliar = refenciaDoNoQueEntrouNaPilha;

        while (true){
            if(noAuxiliar!=null){
                mensagem += "{No{informacao="+noAuxiliar.getInformacao()+"}}\n";
                noAuxiliar = noAuxiliar.getReferenciaDoProximoNo();
            }else{
                break;
            }
        }
        mensagem+="********************\n";
        return mensagem;
    }
}
