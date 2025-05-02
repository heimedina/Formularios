package com.ideas.springboot.form.service;

import java.util.List;

import com.ideas.springboot.form.domain.Pais;

public interface PaisService {
	
	public List<Pais> listar();
	public Pais getById(Integer id);

}
