package br.feltrokinha.gestaofeltrokinha.model.repositories;

import br.feltrokinha.gestaofeltrokinha.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}