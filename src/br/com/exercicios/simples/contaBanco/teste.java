package br.com.exercicios.simples.contaBanco;

public class teste {
    public static void main(String[] args) {

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("João Paulo");
        p1.abrirConta("CC");
        p1.estadoAtual();
        p1.sacar(50f);
        p1.fecharConta();
        p1.estadoAtual();
        p1.pagarMensal();
        p1.sacar(10);
        p1.depositar(20);

    }
}
