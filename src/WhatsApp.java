public record WhatsApp(String mensagem) implements Mensagem{

    public WhatsApp(String mensagem){

        this.mensagem = mensagem;
    }

    @Override
    public String getMensagem() {
        return mensagem;
    }
}
