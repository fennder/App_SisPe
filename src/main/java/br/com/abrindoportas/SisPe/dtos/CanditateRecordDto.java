package br.com.abrindoportas.SisPe.dtos;

import br.com.abrindoportas.SisPe.models.VagaModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CanditateRecordDto(@NotBlank String rg, @NotBlank String nameCandidato, @NotBlank String email, @NotNull VagaModel vaga) {
  
}
