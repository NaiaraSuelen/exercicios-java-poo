package br.com.exercicios.encapsulamento;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        this.getLigado();
        this.getVolume();
        for(int i = 0; i < this.getVolume(); i++) System.out.println("|");
        this.getTocando();
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()) this.setVolume( this.getVolume()+1);
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()) this.setVolume(this.getVolume()-1);
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0) this.setVolume(0);
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) this.setVolume(50);
    }

    @Override
    public void play() {
        if (this.getLigado() && this.getTocando() == false) this.setTocando(true);
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando() == true) this.setTocando(false);
    }
}
