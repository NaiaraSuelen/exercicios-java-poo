package br.com.exercicios.heranca;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(float aumento){
        this.salario = this.salario + aumento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
