package aulas.oo.exerc01;

import java.util.Scanner;

public class Carro {

    //exemplo: 011 protected Carro(){} não é necessário pois foi construído de maneira implicita
    //exemplo: 002 protected Carro(String cor){this.cor = cor} cosntruindo com argumentos. Resulta em erro em "ExemploDeCarro"

    //private String cor;

    private final String marca = "Gol";

    private final String qntdDePessoas = "5";

    protected String getMarca(){
        return "O seu carro possui a marca: " + marca;
    }
    protected String getQntdDePessoas(){
        return "O numero de passageiros é: " + qntdDePessoas;
    }

    protected String dono(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.next();
        return nome + " informamos que a viagem só será permitida se atender o número de passageiros: " ;
    }


    protected String verificarEntrada() {
        Scanner qnt = new Scanner(System.in);
        System.out.println("Digite a quantidade de passageiros: ");
        String qntPass = qnt.next();
        if ( qntPass.equals(qntdDePessoas)){
            return "pode entrar";
        }else{
            return "não pode entrar";
        }
    }

}
