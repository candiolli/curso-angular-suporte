package com.cursosuporte.listatelefonica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cursosuporte.listatelefonica.repository.ContatoRepository;

@RestController
public class ContatoController {

	@Autowired
	private ContatoRepository contatoRepository;
	
	@RequestMapping("/api/contato/buscarTodos")
	public Iterable<Contato> buscarTotos() {
		return contatoRepository.findAll();
	}
	
	@RequestMapping("/api/contato/buscarPorId")
	public Contato buscarPorId(@RequestParam(value="id") Long id) {
		return contatoRepository.findOne(id);
	}
}
