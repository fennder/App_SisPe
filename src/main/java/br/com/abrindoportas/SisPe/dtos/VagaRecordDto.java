package br.com.abrindoportas.SisPe.dtos;

import java.math.BigDecimal;

import br.com.abrindoportas.SisPe.models.CandidateModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record VagaRecordDto(@NotBlank String title, @NotBlank String description, @NotBlank String date, @NotNull BigDecimal payment, @NotNull CandidateModel candidates){
  
}
