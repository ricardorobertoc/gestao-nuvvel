package br.com.nuvvel.gestaonuvvel.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "F")
public class PessoaFisica extends Pessoa{

	private String cpf;
	
	public PessoaFisica(String nome, TipoAcao tipoAcao, StatusPessoa statusPessoa, 
    		String tipoPessoa, String cpf) {
    	super(nome, tipoAcao, statusPessoa, tipoPessoa);
    	this.cpf = cpf;
    }
}
