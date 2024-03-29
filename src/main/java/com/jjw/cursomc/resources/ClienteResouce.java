package com.jjw.cursomc.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jjw.cursomc.domain.Cliente;
import com.jjw.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResouce {
	@Autowired
	private ClienteService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Cliente obj = service.buscar(id);
		
		if(obj==null) {
			return ResponseEntity.ok().body(obj);			
		}
		return ResponseEntity.notFound().build();
	}

}
