package br.com.nuvvel.gestaonuvvel.dto;


import br.com.nuvvel.gestaonuvvel.model.PessoaFisica;
import br.com.nuvvel.gestaonuvvel.model.PessoaJuridica;
import br.com.nuvvel.gestaonuvvel.model.StatusPessoa;
import br.com.nuvvel.gestaonuvvel.model.TipoAcao;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDto {
	
public Long id;
	
    private String nome;
    private TipoAcao tipoAcao;
    private StatusPessoa statusPessoa;
    private String tipoPessoa;
    private String razaoSocial;
    private String cnpj;
    private String cpf;
    
    public PessoaFisica transformaParaPessoaFisica() {
    	return new PessoaFisica(nome, tipoAcao, statusPessoa, tipoPessoa, cpf);
    }
    
    public PessoaJuridica transformaParaPessoaJuridica() {
    	return new PessoaJuridica(nome, tipoAcao, statusPessoa, tipoPessoa, razaoSocial, cnpj);
    }
    
}








