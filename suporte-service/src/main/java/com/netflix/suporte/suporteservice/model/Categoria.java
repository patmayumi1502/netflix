package com.netflix.suporte.suporteservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "CATEGORIA", schema = "SUPORTE_NETFLIX")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDCATEGORIA")
	@JsonProperty
	@Getter @Setter private Integer idCategoria; 
	
	@Column(name = "CATEGORIA")
	@JsonProperty
	@Getter @Setter private String categoria;

}
