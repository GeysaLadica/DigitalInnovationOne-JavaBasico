package aulas.oo.exerc03;

public class Impostos {

    public static void main (String [] args){

        Funcionario gerente = new Gerente();
        gerente.setSalario(1000.0);
        System.out.println("O Gerente deve pagar R$ "+ gerente.calculo() + " de imposto");

        Funcionario supervisor = new Supervisor();
        supervisor.setSalario(1000.0);
        System.out.println("O Supervisor deve pagar R$ " + supervisor.calculo() + " de impostos");

        Funcionario atendente = new Atendente();
        atendente.setSalario(1000.0);
        System.out.println("O Atendente deve pagar R$" + atendente.calculo() + " de impostos");

    }
}
