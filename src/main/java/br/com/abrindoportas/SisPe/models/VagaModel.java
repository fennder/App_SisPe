package br.com.abrindoportas.SisPe.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_vagas")
public class VagaModel extends RepresentationModel<VagaModel> implements Serializable {
  
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID idvaga;

  private String title;

  private String description;
  
  private String date;
  
  private BigDecimal payment;

  @OneToMany(mappedBy = "vagas", cascade = CascadeType.REMOVE)
  private List<CandidateModel> candidates;

  public UUID getIdvaga() {
    return idvaga;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public String getDate() {
    return date;
  }

  public BigDecimal getPayment() {
    return payment;
  }

  public List<CandidateModel> getCandidates() {
    return candidates;
  }

  

}
