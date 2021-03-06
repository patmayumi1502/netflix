package com.netflix.suporte.suporteservice.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Table(name = "CHAMADOS", schema = "SUPORTE_NETFLIX")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Chamados implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "IDCHAMADO")
	@Getter private Integer idChamado; 
	
	@JsonProperty
	@Column(name = "CPFPESSOA")
	@Getter @Setter private String cpfPessoa;
	
	@JsonProperty
	@Column(name = "NOMEPESSOA")
	@Getter @Setter private String nomePessoa;
	
	@JsonProperty
	@Column(name = "EMAILPESSOA")
	@Getter @Setter private String emailPessoa;
	
	@JsonProperty
	@Column(name = "DETALHECHAMADO")
	@Getter @Setter private String detalheChamado;
	
	@JsonProperty
	@Column(name = "DATACHAMADO")
	@Getter @Setter private Date dataChamado;
	
	@JsonProperty
	@Column(name = "IDCATEGORIA")
	@Getter @Setter private Integer idCategoria;
	
}
