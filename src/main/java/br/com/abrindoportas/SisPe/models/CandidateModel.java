package br.com.abrindoportas.SisPe.models;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_candidates")
public class CandidateModel extends RepresentationModel<CandidateModel> implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID idcandidate;

  @Column(unique = true)
  private String cpf;

  private String nameCandidato;

  private String email;

  @ManyToOne
  private VagaModel vagas;

  public UUID getIdcandidate() {
    return idcandidate;
  }

  public void setIdcandidate(UUID idcandidate) {
    this.idcandidate = idcandidate;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNameCandidato() {
    return nameCandidato;
  }

  public void setNameCandidato(String nameCandidato) {
    this.nameCandidato = nameCandidato;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public VagaModel getVaga() {
    return vagas;
  }

  public void setVaga(VagaModel vagas) {
    this.vagas = vagas;
  }

}
