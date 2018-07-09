package br.com.rafaeldantas.schedule.bots;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;

public class BotMensagemPorCron {
	
	  private static final String TIME_ZONE = "America/Sao_Paulo";
	  private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	  private Integer contador = 1;
	 
	  @Scheduled(cron = "0 0 12 * * *", zone = TIME_ZONE) // Vai executar 12h e 0h
	  public void verificaPorHora() {
		  System.out.println("Contador: " + contador + " - Instante: " + sdf.format(new Date()));
		  contador++;
	  }

}
