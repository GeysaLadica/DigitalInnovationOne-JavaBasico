package aulas.trabalhandoComDatas.javaLocalDate.exercLocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AddDias {
    public static void main (String []args){
        LocalDateTime agora = LocalDateTime.now();

        LocalDateTime futuro = agora.plusYears(4).plusMonths(6).plusHours(13);



        System.out.println(agora);
        System.out.println(futuro);

    }
}
