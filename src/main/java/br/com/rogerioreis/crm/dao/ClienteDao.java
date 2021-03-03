package br.com.rogerioreis.crm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rogerioreis.crm.entity.Cliente;

@Repository
public interface ClienteDao extends JpaRepository<Cliente, Long> {

	Cliente findById(long id);
}
