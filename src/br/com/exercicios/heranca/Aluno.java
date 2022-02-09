package br.com.exercicios.heranca;

public class Aluno extends Pessoa{
    private String matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada!");
    }

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
