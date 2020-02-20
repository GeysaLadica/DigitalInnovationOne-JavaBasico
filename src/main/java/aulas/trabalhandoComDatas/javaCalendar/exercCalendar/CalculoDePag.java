package aulas.trabalhandoComDatas.exercCalendar;

import java.util.Calendar;


public class CalculoDePag {

    public static void main (String [] args) {

        System.out.println("############## OBRIGADA POR COMPRAR NOSSOS PRODUTOS! ##############");

        //Data da compra
        Calendar dtCompra = Calendar.getInstance();
        System.out.println("Data da compra: " + dtCompra.getTime());
        System.out.println("Você possui 5 dias úteis após a compra para pagar.");

        //Set data de vencimento

        dtCompra.add(Calendar.DATE, 5);
        //System.out.println("Sua data de vencimento é: " + dtCompra.getTime()); //verificar dia do vencimento

        //Analisando dia da semana do vencimento

        int diaDaSemana = dtCompra.get(Calendar.DAY_OF_WEEK);


        if(diaDaSemana == 1){
            dtCompra.add(Calendar.DATE, 1);
            System.out.println("Seu Vencimento caiu em um Domingo, por esse motivo sua data foi alterada para:  " + dtCompra.getTime());
        }
        else if (diaDaSemana == 7){
            dtCompra.add(Calendar.DATE, 2);
            System.out.println("Seu Vencimento caiu em um Sábado, por esse motivo sua data foi alterada para:  " + dtCompra.getTime());
        }
        else{
            System.out.println("Você precisa pagar sua conta até o dia: " + dtCompra.getTime());
        }



    }

}
