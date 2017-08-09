package com.cursosuporte.listatelefonica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cursosuporte.listatelefonica.repository.ContatoRepository;

@RestController
@RequestMapping("/api/contato")
public class ContatoController {

	@Autowired
	private ContatoRepository contatoRepository;
	
	@CrossOrigin(origins = "http://localhost:8085")
    @GetMapping("/buscarTodos")
	public Iterable<Contato> buscarTotos() {
		return contatoRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:8085")
    @GetMapping("/buscarPorId")
	public Contato buscarPorId(@RequestParam(value="id") Long id) {
		return contatoRepository.findOne(id);
	}
}
