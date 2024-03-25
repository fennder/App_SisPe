package br.com.abrindoportas.SisPe.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.abrindoportas.SisPe.models.CandidateModel;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateModel, UUID>{

}
