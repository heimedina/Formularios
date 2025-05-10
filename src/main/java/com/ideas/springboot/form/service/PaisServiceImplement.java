package com.ideas.springboot.form.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ideas.springboot.form.domain.Pais;

@Service
public class PaisServiceImplement implements PaisService {

	private List<Pais> lista;
	
	public PaisServiceImplement() {
		this.lista=Arrays.asList(
				new Pais(1, "ES", "Espana"), 
				new Pais(2, "MX", "México"), 
				new Pais(3, "CL", "Chile"),
				new Pais(4, "AR", "Argentina"), 
				new Pais(5, "CO", "Colombia"), 
				new Pais(6, "VE", "Venezuela"));
	}

	@Override
	public List<Pais> listar() {
		
		return lista;
	}

	@Override
	public Pais getById(Integer id) {
		Pais resultado = null;
		for(Pais pais : this.lista) {
			if (id== pais.getId()) {
				resultado = pais;
				break;				
			}
		}
		return resultado;
	}

}
