package br.com.nuvvel.gestaonuvvel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nuvvel.gestaonuvvel.model.Pessoa;
import br.com.nuvvel.gestaonuvvel.model.PessoaFisica;
import br.com.nuvvel.gestaonuvvel.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa salvarPessoa(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
}
