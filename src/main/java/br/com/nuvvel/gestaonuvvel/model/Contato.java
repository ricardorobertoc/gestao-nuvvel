package br.com.nuvvel.gestaonuvvel.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contato {

	public Long id;
	public String email;
	public String telefone;
	public Pessoa pessoa;
	
}
