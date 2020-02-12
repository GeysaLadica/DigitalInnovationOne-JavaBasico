package aulas.oo.exerc02;

public class CarroExercExemplo {

    public static void main (String [] args){
        CarroExerc carroExerc = new CarroExerc("Civic","Honda","2015");

        System.out.println("O modelo do carro é: " + carroExerc.getModelo());
        System.out.println("A marca do carro é: " + carroExerc.getMarca());
        System.out.println("O ano do carro é: " + carroExerc.getAno());

    }
}
