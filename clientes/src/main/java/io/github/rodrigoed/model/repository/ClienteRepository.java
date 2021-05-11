package io.github.rodrigoed.model.repository;

import io.github.rodrigoed.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
