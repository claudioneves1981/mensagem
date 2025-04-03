import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Mensagem mensagem;
        
        do {
            System.out.println("Escolha o metodo para envio da mensagem");
            System.out.println("1 -SMS");
            System.out.println("2 - E-Mail");
            System.out.println("3 - Redes Sociais");
            System.out.println("4 - WhatsApp");
            System.out.println("5 - Sair do Programa");
            int option = scanner.nextInt();
            
            if (option == 1)
                mensagem = enviarSMS(escreveMensagem());
            else if (option == 2)
                mensagem = enviarEmail(escreveMensagem());
            else if (option == 3)
                mensagem = enviarRedesSociais(escreveMensagem());
            else if (option == 4)
                mensagem = enviarWhatsApp(escreveMensagem());
            else if (option == 5) {
                break;
            }else {
                System.out.println("Opção Invalida");
                continue;
            }

            System.out.println("A mensagem enviada foi -> " + mensagem.getMensagem() + " <- por " + mensagem.getClass().getCanonicalName());


        }while(true);


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