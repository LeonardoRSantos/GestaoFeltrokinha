package br.feltrokinha.gestaofeltrokinha.model.repositories;

import br.feltrokinha.gestaofeltrokinha.model.entity.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}