public record SMS(String mensagem) implements Mensagem {


    public SMS(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMensagem() {
        return mensagem;
    }
}
