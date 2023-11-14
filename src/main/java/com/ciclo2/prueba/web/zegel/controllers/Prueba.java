package com.ciclo2.prueba.web.zegel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ciclo2.prueba.web.zegel.models.Cliente;
import com.ciclo2.prueba.web.zegel.services.ClienteService;

@Controller
@RequestMapping("/oficio")
public class Prueba {

	@Autowired
	private ClienteService servicioCliente;
	

	 final String variableConst = "HOLA MUNDO";
	 final int var3 = 8;
	
	@GetMapping("/inicio")
	public String index() {
		int var1;
		
		int var2;
		int calcular;
		int calcularSuma;
		int calcularResta;
		
		String varNombre = "Elvis Alcantara";
		Double varDouble = 10.9;
		
		Boolean varCondicional = true;
		Boolean varCondicional2 = false;
		
		var1 = 10;
		
		var2= 2;
		
		calcular = var1*var2;
		calcularSuma = var1+var2;
		calcularResta = var1-var2;
		
		
		//System.out.println(calcular);
		//System.out.println(calcularSuma);
		//System.out.println(calcularResta);
		System.out.println(varCondicional);
		System.out.println(varCondicional2);
		
		return "inicio";	
	}
	

	@GetMapping("/inicio2")
	public String ejercicio() {
		
		String diaSemana = "lunes";

		switch(diaSemana) {
		  case "lunes":
			String nombre = "ELVIS";
			String nombre2 = "TIENE QUE ESTUDIAR PROGRAMACION";
		    System.out.println(nombre+" "+nombre2);
		    break;
		  case "martes":
		    System.out.println("HACER EJERCICIOS");
		    break;
		  default:
		    System.out.println("NO EXISTE EL DÍA");
		}

		
		return "inicio";
	}
	
	@GetMapping("/inicio3")
	public String inicio3() {
		
	int acum = 0;
	int suma = 0;
	
	do {
		 String nombre = "Elvis";
		 System.out.println(nombre+""+acum);
		 acum++;
		
	}while(acum<100);
	
		
		return "inicio";
	}

	@GetMapping("/listar-clientes")
	public String listarClientes(Model model) {
		List<Cliente> clientes = servicioCliente.getListarDatos();
		
		Cliente clie = new Cliente();
		
		
		
		model.addAttribute("cli", clientes);
		model.addAttribute("clie", clie);
		
		//for (int i = 0; i < clientes.size(); i++) {
			//System.out.println(clientes.get(i).getNombre()+" "+ clientes.get(i).getApellido());
		//}
		return "inicio";
	}
	
	@PostMapping("/crear-clientes")
	public String crearClientes(Cliente cli) {
		
		servicioCliente.guardarDatosCliente(cli);
		
		return "redirect:/oficio/listar-clientes";
	}
	
	
}
