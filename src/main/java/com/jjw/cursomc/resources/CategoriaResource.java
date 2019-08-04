package com.jjw.cursomc.resources;

/*import java.util.ArrayList;
import java.util.List;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jjw.cursomc.domain.Categoria;
import com.jjw.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		
		/*Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Informática");
		List<Categoria> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);*/
		
		
		return ResponseEntity.ok().body(obj);
	}

}
