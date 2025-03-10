package io.github.yuricsg.eventosapi.eventosapi.repository;

import io.github.yuricsg.eventosapi.eventosapi.entities.Evento;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EventoRepositoryTest {

    @Autowired
    EventoRepository repository;

    @Test
    public void salvarTest(){

        Evento evento = new Evento();
        evento.setNome("Carvalheira na ladeira");

        var eventoSalvo = repository.save(evento);
        System.out.println("Evento salvo: " + eventoSalvo);
    }
}
