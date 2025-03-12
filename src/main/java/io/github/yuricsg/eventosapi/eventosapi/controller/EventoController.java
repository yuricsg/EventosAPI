package io.github.yuricsg.eventosapi.eventosapi.controller;

import io.github.yuricsg.eventosapi.eventosapi.controller.DTO.EventoDTO;
import io.github.yuricsg.eventosapi.eventosapi.entities.Evento;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @PostMapping
    public ResponseEntity salvar(@RequestBody EventoDTO evento){

        return new ResponseEntity("Evento salvo!" + evento, HttpStatus.CREATED);
    }
}
