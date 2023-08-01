package Padroes.observer;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
    
    private List<ChegadaAniversarianteObservador> observadores = new ArrayList<>();

    public void registrarObservadores(ChegadaAniversarianteObservador observador){
        observadores.add(observador);
    }

    public void monitorar(){
        Scanner entrada = new Scanner(System.in);

        String valor = "";
        while(!"sair".equalsIgnoreCase(valor)){
            System.out.println("Aniversariante chegou?");
            valor = entrada.nextLine();
            if("sim".equalsIgnoreCase(valor)){
                //criar o evento
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
                valor = "sair";
                // notificar os observadores
                observadores.forEach(o -> o.chegou(evento));
            }else{
                System.out.println("Alarme falso!");
            }
        }
        entrada.close();
    }
}
