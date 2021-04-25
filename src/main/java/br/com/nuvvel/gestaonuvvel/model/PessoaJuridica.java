package br.com.nuvvel.gestaonuvvel.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "J")
public class PessoaJuridica extends Pessoa{
	
	public String razaoSocial;
	public String cnpj;
}
