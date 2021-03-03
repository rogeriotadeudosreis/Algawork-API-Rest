package br.com.rogerioreis.crm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rogerioreis.crm.dao.ClienteDao;
import br.com.rogerioreis.crm.entity.Cliente;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/crm")
@Api(value = "API Rest Clientes")
public class ClienteRest {

	@Autowired
	private ClienteDao clienteDao;

	@GetMapping("/clientes")
	@ApiOperation(value = "Retorna uma lista de clientes")
	public List<Cliente> get() {
		return clienteDao.findAll();
	}

	@GetMapping("/clientes/{id}")
	@ApiOperation(value = "Retorna um cliente específico")
	public Cliente listClientById(@PathVariable(value = "id") long id) {
		return clienteDao.findById(id);
	}

	@PostMapping("/clientes")
	@ApiOperation(value = "Salva ou atualiza um cliente")
	public void post(@RequestBody Cliente cliente) {
		clienteDao.save(cliente);
	}

	@DeleteMapping("/clientes")
	@ApiOperation(value = "Deleta um cliente")
	public void delete(@RequestBody Cliente cliente) {
		clienteDao.delete(cliente);
	}

}
