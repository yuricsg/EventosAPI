package io.github.yuricsg.eventosapi.eventosapi.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "inscricoes")
@Data
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "evento_id", nullable = false)
    private Evento evento;


    @ManyToOne
    @JoinColumn(name = "participante_id", nullable = false)
    private Participante participante;

    private Instant dataInscricao;
}
