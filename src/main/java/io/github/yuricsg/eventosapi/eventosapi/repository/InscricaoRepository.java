package io.github.yuricsg.eventosapi.eventosapi.repository;

import io.github.yuricsg.eventosapi.eventosapi.entities.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InscricaoRepository extends JpaRepository<Inscricao, UUID> {
}
