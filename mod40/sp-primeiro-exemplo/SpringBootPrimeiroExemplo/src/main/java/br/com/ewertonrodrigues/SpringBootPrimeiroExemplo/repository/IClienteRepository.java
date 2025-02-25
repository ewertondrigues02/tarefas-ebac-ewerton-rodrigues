package br.com.ewertonrodrigues.SpringBootPrimeiroExemplo.repository;

import br.com.ewertonrodrigues.SpringBootPrimeiroExemplo.domain.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long> {

}