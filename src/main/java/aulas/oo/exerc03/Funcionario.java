package aulas.oo.exerc03;

public class Funcionario {

    private String nome;

    private double salario;

    //nome
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    //salario
    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    //calculo
    public double calculo (){
        return this.salario * 0.01;
    }
}
