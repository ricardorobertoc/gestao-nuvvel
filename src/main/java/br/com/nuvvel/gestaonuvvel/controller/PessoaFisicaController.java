package br.com.nuvvel.gestaonuvvel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nuvvel.gestaonuvvel.dto.PessoaDto;
import br.com.nuvvel.gestaonuvvel.model.Pessoa;
import br.com.nuvvel.gestaonuvvel.service.PessoaService;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaFisicaController {

	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping
	public ResponseEntity<Pessoa> incluirPessoa(@Valid @RequestBody PessoaDto pessoaDto) {
		Pessoa pessoa = new Pessoa();
		if (pessoaDto.getTipoPessoa().equals("F")) {
			pessoa = pessoaService.salvarPessoa(pessoaDto.transformaParaPessoaFisica());
		} else {
			pessoa = pessoaService.salvarPessoa(pessoaDto.transformaParaPessoaJuridica());
		}
		return new ResponseEntity<>(pessoa, HttpStatus.OK);
	}
}











