package com.jjw.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jjw.cursomc.domain.Categoria;
import com.jjw.cursomc.repositories.CategoriaRepository;
import com.jjw.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository repo;
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		if(obj==null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id:" + id +
					", Tipo: " + Categoria.class.getName());
		}
		return obj.orElse(null);
	}

}
