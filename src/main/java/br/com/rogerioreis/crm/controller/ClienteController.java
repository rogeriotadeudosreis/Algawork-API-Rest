package br.com.rogerioreis.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rogerioreis.crm.dao.ClienteDao;
import br.com.rogerioreis.crm.entity.Cliente;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/crm")
@Api(value = "API Rest Clientes")
public class ClienteController {
	
	@Autowired
	private ClienteDao clienteDao;
	
	@GetMapping("/clientes")
	@ApiOperation(value = "Retorna uma lista de clientes")
	public List<Cliente> get() {
		return clienteDao.findAll();
	}

}
