package com.jjw.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jjw.cursomc.domain.Cliente;
import com.jjw.cursomc.repositories.ClienteRepository;
import com.jjw.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository repo;
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		if(obj==null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id:" + id +
					", Tipo: " + Cliente.class.getName());
		}
		return obj.orElse(null);
	}

}
