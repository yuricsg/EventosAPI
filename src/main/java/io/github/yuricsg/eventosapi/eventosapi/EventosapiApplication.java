package io.github.yuricsg.eventosapi.eventosapi;

import io.github.yuricsg.eventosapi.eventosapi.entities.Evento;
import io.github.yuricsg.eventosapi.eventosapi.repository.EventoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@SpringBootApplication
public class EventosapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventosapiApplication.class, args);
	}
}
