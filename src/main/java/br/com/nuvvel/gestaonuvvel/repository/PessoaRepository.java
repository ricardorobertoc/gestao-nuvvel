package br.com.nuvvel.gestaonuvvel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nuvvel.gestaonuvvel.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
