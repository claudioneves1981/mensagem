import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Mensagem mensagem;

        int option;

        do {
            System.out.println("Escolha o metodo para envio da mensagem");
            System.out.println("1 -SMS");
            System.out.println("2 - E-Mail");
            System.out.println("3 - Redes Sociais");
            System.out.println("4 - WhatsApp");
            System.out.println("5 - Sair do Programa");
            option = scanner.nextInt();

            switch(option) {

                case 1:
                    mensagem = enviarSMS(escreveMensagem());
                    break;
                case 2:
                    mensagem = enviarEmail(escreveMensagem());
                    break;
                case 3:
                    mensagem = enviarRedesSociais(escreveMensagem());
                    break;
                case 4:
                    mensagem = enviarWhatsApp(escreveMensagem());
                    break;
                case 5:
                    continue;
                default:
                    System.out.println("Opção Invalida");
                    continue;
            }

            System.out.println("A mensagem enviada foi -> " + mensagem.getMensagem() + " <- por " + mensagem.getClass().getCanonicalName());


        }while(option != 5);


    }

    private static String escreveMensagem(){
        System.out.println("Digite a Mensagem");
        return scanner.next();
    }

    private static Mensagem enviarSMS(String mensagemEnviada){
        return new SMS(mensagemEnviada);
    }

    private static Mensagem enviarEmail(String mensagemEnviada){
        return new Email(mensagemEnviada);
    }

    private static Mensagem enviarRedesSociais(String mensagemEnviada) {
         return new RedesSociais(mensagemEnviada);
    }

    private static Mensagem enviarWhatsApp(String mensagemEnviada) {
        return new WhatsApp(mensagemEnviada);
    }

}