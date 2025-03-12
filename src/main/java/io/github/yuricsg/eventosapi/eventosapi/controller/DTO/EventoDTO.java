package io.github.yuricsg.eventosapi.eventosapi.controller.DTO;

import java.time.Instant;

public record EventoDTO(String nome,
                        String descricao,
                        Instant dataHoraInicio,
                        Instant dataHoraFim,
                        Integer maxParticipantes,
                        String palestrante) {


}
