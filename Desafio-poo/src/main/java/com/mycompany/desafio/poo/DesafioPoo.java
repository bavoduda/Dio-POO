package com.mycompany.desafio.poo;


import com.mycompany.desafio.poo.Internet;
import com.mycompany.desafio.poo.Musica;
import com.mycompany.desafio.poo.Telefone;

public class DesafioPoo implements Internet, Musica,Telefone {

    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Implementação dos métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public static void main(String[] args) {
        DesafioPoo meuIPhone = new DesafioPoo ();
        
        // Teste das funcionalidades de ReprodutorMusical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        
        // Teste das funcionalidades de AparelhoTelefonico
        meuIPhone.ligar("123-456-7890");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        
        // Teste das funcionalidades de NavegadorInternet
        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
