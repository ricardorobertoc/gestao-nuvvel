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
	
	private String razaoSocial;
	private String cnpj;
	
	public PessoaJuridica(String nome, TipoAcao tipoAcao, StatusPessoa statusPessoa, 
    		String tipoPessoa, String razaoSocial, String cnpj) {
    	super(nome, tipoAcao, statusPessoa, tipoPessoa);
    	this.razaoSocial = razaoSocial;
    	this.cnpj = cnpj;
    }
}
