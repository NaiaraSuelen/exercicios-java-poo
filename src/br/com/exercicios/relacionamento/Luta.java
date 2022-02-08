package br.com.exercicios.relacionamento;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            System.out.println("Luta marcada!");
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else {
            System.out.println("Luta reprovada!");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if(this.aprovada == true){
            System.out.println("**DESAFIADO**");
            this.desafiado.apresentar();
            System.out.println("**DESAFIANTE**");
            this.desafiante.apresentar();

            Random aleatorio =  new Random();
            int vencedor = aleatorio.nextInt(3);

            System.out.println("***RESULTADO DA LUTA***");
            switch (vencedor){
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 2:
                    System.out.println("Vencedor " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 3:
                    System.out.println("Vencedor " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }
        else System.out.println("Luta não foi aprovada!");
    }
}
