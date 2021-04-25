package br.com.nuvvel.gestaonuvvel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nuvvel.gestaonuvvel.model.Pessoa;
import br.com.nuvvel.gestaonuvvel.model.PessoaFisica;
import br.com.nuvvel.gestaonuvvel.model.PessoaJuridica;
import br.com.nuvvel.gestaonuvvel.model.StatusPessoa;
import br.com.nuvvel.gestaonuvvel.service.PessoaService;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaFisicaController {

	@Autowired
	private PessoaService pessoaService;
	
	/* Fazer uma classe Pessoa com todos os atributos de fisico e jurico para receber os dados */
	@PostMapping
	public ResponseEntity<Pessoa> incluirPessoa(@Valid @RequestBody Pessoa pessoa) {
		pessoa.setStatusPessoa(StatusPessoa.ATIVO);
		pessoaService.salvarPessoa(pessoa);
		return new ResponseEntity<>(pessoa, HttpStatus.OK);
	}
}
