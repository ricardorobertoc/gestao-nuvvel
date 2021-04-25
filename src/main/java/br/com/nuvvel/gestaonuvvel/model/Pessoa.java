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
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipoPessoa", length = 1, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("P")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Nome é obrigatório!")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private TipoAcao tipoAcao;
	
	/*
	 * @NotNull(message = "Contato é obrigatório!") private Contato contato;
	 */
	
	@Enumerated(EnumType.STRING)
	private StatusPessoa statusPessoa;
	
	@Column(insertable = false, updatable = false)
	private String tipoPessoa;
	
	
	public Pessoa(String nome, TipoAcao tipoAcao, StatusPessoa statusPessoa, String tipoPessoa) {
    	this.nome = nome;
    	this.tipoAcao = tipoAcao;
    	this.statusPessoa = statusPessoa;
    	this.tipoPessoa = tipoPessoa;
    }
	
	
	
}
