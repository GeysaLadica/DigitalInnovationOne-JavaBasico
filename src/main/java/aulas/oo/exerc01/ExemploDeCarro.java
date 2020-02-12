package aulas.oo.exerc01;

public class ExemploDeCarro {

    public static void main (String []args){

        Carro carro = new Carro(); //exemplo: 002 ao descomentar o código será exigido (cor: "azul")

        System.out.println(carro.getMarca());
        System.out.println(carro.dono());
        System.out.println(carro.getQntdDePessoas());
        System.out.println(carro.verificarEntrada());


    }

}
