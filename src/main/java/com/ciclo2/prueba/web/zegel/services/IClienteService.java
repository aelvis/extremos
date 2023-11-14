package com.ciclo2.prueba.web.zegel.services;

import java.util.List;

import com.ciclo2.prueba.web.zegel.models.Cliente;

public interface IClienteService {

	List<Cliente> getListarDatos();
	
	Cliente guardarDatosCliente(Cliente cli);
	
}
