package br.com.rafaeldantas.schedule.bots;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class BotMensagemPorMinuto {

	private final long SEGUNDO = 1000;
	private final long MINUTO = SEGUNDO * 60;
	private Integer contador = 1;
	private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	@Scheduled(fixedDelay = MINUTO * 1)
	public void verificaPorMinuto() {
		System.out.println("Contador: " + contador + " - Instante: " + sdf.format(new Date()));
		contador++;
	}

}
