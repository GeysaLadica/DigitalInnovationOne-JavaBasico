package aulas.oo.exerc02;

public class CarroExerc {

    public CarroExerc(String modelo, String marca, String ano){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    private String modelo;
    private String marca;
    private String ano;

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public String getAno(){
        return ano;
    }


}
