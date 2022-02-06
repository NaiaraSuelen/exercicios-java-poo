package br.com.exercicios.simples.contaBanco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("status: " + this.getStatus());
    }
    public ContaBanco(float saldo, boolean status) {
        this.saldo = saldo;
        this.status = status;
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);

        if(t == "CC") this.setSaldo(50);
        else if(t == "CP") this.setSaldo(150);
    }

    public void fecharConta(){
        if(this.getSaldo() > 0)
            System.out.println("Conta não pode ser fechada, contém saldo");
        else if(this.getSaldo() < 0)
            System.out.println("Conta não pode ser fechada, contém débitos");
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso!");
        }
        else System.out.println("Conta inativa para depósito!");
    }

    public void sacar(float v){
        if(this.getStatus()){
            if (getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saldo realizado com sucesso");
            }
            else System.out.println("Saldo insuficiente");
        }
        else System.out.println("Conta inativa!");
    }

    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC")v = 12;
        else if(this.getTipo() == "CP")v = 20;

        if (this.getStatus())this.setSaldo(getSaldo() - v);
        else System.out.println("Conta inativa!");
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
