package br.com.exercicios.relacionamento;

public class main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[3];
       l[0] = new Lutador ("Kaleu","Brasil", 33, 1.88f, 78,8, 2, 3);
       l[1] = new Lutador ("Thales","França", 28, 1.90f, 85.5f,10, 4, 2);
       l[2] = new Lutador ("Andrew","Alemanha", 36, 1.90f, 90,14, 3, 3);

        l[0].status();
        l[1].status();
        l[0].ganharLuta();
        System.out.println();
        l[0].status();
        l[1].perderLuta();
        System.out.println();
        l[1].status();

        System.out.println();
        Luta NF013 = new Luta();

        NF013.marcarLuta(l[0],l[2]);
        NF013.lutar();

    }
}
