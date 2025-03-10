package io.github.yuricsg.eventosapi.eventosapi.repository;

import io.github.yuricsg.eventosapi.eventosapi.entities.Participante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParticipanteRepository extends JpaRepository<Participante, UUID> {
}
