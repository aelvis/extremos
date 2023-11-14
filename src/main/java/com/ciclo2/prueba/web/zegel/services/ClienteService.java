package com.ciclo2.prueba.web.zegel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo2.prueba.web.zegel.dao.IClienteDao;
import com.ciclo2.prueba.web.zegel.models.Cliente;

@Service
public class ClienteService implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	public List<Cliente> getListarDatos() {
		return clienteDao.findAll();
	}

	@Override
	public Cliente guardarDatosCliente(Cliente cli) {
		return clienteDao.save(cli);
	}

	
	
}
