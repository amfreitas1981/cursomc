package com.amfreitas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amfreitas.cursomc.domain.Categoria;
import com.amfreitas.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		// Categoria obj = repo.findOne(id); -- utilizamos esta declaração, para versão anterior a 2.X.X, que utiliza o Java 7.
		// Para instanciação de objetos para Java 8:
		Optional<Categoria> obj = repo.findById(id);
		// O objeto Optional é declarado na instância, do tipo Categoria, importando de: import java.util.Optional
		return (obj).orElse(null);
	}
	
}
