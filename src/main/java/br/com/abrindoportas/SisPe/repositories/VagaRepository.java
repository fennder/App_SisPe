package br.com.abrindoportas.SisPe.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.abrindoportas.SisPe.models.VagaModel;

@Repository
public interface VagaRepository extends JpaRepository<VagaModel, UUID>{
  
}
