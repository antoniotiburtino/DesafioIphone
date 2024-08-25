package iphone.java;

import multifuncional.AparelhoTelefonico;
import multifuncional.NavegadorInternet;
import multifuncional.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical  {

    @Override
    public void ligar(String numero) {
    System.out.println("Ligando para o número: " + numero + ".");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo o correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url + "." );
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando a musica: " + musica + ".");
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }
}



