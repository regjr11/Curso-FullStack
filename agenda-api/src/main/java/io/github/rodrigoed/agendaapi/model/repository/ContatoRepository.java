package io.github.rodrigoed.agendaapi.model.repository;

import io.github.rodrigoed.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
