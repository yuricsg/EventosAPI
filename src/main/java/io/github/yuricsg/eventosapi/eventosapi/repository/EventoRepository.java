package io.github.yuricsg.eventosapi.eventosapi.repository;

import io.github.yuricsg.eventosapi.eventosapi.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventoRepository extends JpaRepository<Evento, UUID> {
}
