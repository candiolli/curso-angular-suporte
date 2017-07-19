package com.cursosuporte.listatelefonica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cursosuporte.listatelefonica.repository.OperadoraRepository;

@RestController
public class OperadoraController {

	@Autowired
	private OperadoraRepository operadoraRepository;
	
	@RequestMapping("/api/operadora/buscarTodos")
	public Iterable<Operadora> buscarTotos() {
		return operadoraRepository.findAll();
	}
	
	@RequestMapping("/api/operadora/buscarPorId")
	public Operadora buscarPorId(@RequestParam(value="id") Long id) {
		return operadoraRepository.findOne(id);
	}
}
