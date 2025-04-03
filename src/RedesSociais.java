public record RedesSociais(String mensagem) implements Mensagem{

    public RedesSociais(String mensagem){
        this.mensagem = mensagem;
    }


    @Override
    public String getMensagem() {
        return mensagem;
    }
}
