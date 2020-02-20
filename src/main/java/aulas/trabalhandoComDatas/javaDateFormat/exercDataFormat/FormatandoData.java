package aulas.trabalhandoComDatas.javaDateFormat.exercDataFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatandoData {
    public static void main (String [] args){
        Date agora = new Date();

       // System.out.println(agora);

        SimpleDateFormat formatando = new SimpleDateFormat("dd/MM/yyyy - E - HH:mm");

        String dataFormatada = formatando.format(agora);

        System.out.println(dataFormatada);
    }
}
