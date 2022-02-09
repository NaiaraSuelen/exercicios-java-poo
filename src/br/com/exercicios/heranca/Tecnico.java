package br.com.exercicios.heranca;

public class Tecnico extends Aluno{
    private String registroProfissional;

    public void praticar(){
        System.out.println("Aluno técnico praticando!");
    }
    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
