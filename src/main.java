import iphone.java.Iphone;

public class main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //APARELHO TELEFÔNICO
        System.out.println("|-----APARELHO TELEFÔNICO-----|");
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //REPRODUTOR MUSICAL
        System.out.println("|-----REPRODUTOR MUSICAL-----|");
        iphone.tocar("Legends never die");
        iphone.pausar();
        iphone.selecionarMusica();

        //NAVEGADOR DE INTERNET
        System.out.println("|-----NAVEGAR NA INTERNET-----|");
        iphone.exibirPagina("https://www.apple.com/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
