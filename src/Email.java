public record Email(String mensagem) implements Mensagem{

   public Email(String mensagem){
       this.mensagem = mensagem;
   }

    @Override
    public String getMensagem() {
        return mensagem;
    }
}
