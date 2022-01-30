package arquivos.classes;

public class Fila<T> {
    private No<T> refenciaDoNoQueEntraNaFila=null;

    public Fila(){
    }

    public void enqueue(T object){
        No novoNo = new No(object);
        novoNo.setReferenciaNo(refenciaDoNoQueEntraNaFila);
        refenciaDoNoQueEntraNaFila = novoNo;
    }

    public T first(){

        if(!this.isEmpty()){
            No primeiroNo = refenciaDoNoQueEntraNaFila;

            while (true){
                if(primeiroNo.getReferenciaNo()!=null){
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getConteudo();
        }

        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refenciaDoNoQueEntraNaFila;
            No noAuxiliar = refenciaDoNoQueEntraNaFila;

            while (true){
                if(primeiroNo.getReferenciaNo()!=null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else{
                    noAuxiliar.setReferenciaNo(null);
                    break;
                }
            }

            return (T) primeiroNo.getConteudo();
        }

        return null;
    }

    public boolean isEmpty(){
        return refenciaDoNoQueEntraNaFila==null;
    }

    @Override
    public String toString() {
        String mensagem="";
        No noAuxiliar= refenciaDoNoQueEntraNaFila;

        if(refenciaDoNoQueEntraNaFila!=null){
            while (true){
                mensagem+="[No{conteúdo="+noAuxiliar.getConteudo()+"}]--->";

                if(noAuxiliar.getReferenciaNo()!=null){
                    noAuxiliar = noAuxiliar.getReferenciaNo();
                }else {
                    mensagem+="null";
                    break;
                }
            }

        }else{
            mensagem = "null";
        }
        return mensagem;
    }
}
