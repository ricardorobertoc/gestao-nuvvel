package br.com.nuvvel.gestaonuvvel.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipoPessoa", length = 1, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("P")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	@NotBlank(message = "Nome é obrigatório!")
	public String nome;
	
	@Enumerated(EnumType.STRING)
	public TipoAcao tipoAcao;
	
	/*
	 * @NotNull(message = "Contato é obrigatório!") public Contato contato;
	 */
	
	@Enumerated(EnumType.STRING)
	public StatusPessoa statusPessoa;
	
	@Column(insertable = false, updatable = false)
	public String tipoPessoa;
	
	
	
	
	
	
}
