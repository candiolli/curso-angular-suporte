package com.cursosuporte.listatelefonica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cursosuporte.listatelefonica.repository.OperadoraRepository;

@RestController
@RequestMapping("/api/operadora")
public class OperadoraController {

	@Autowired
	private OperadoraRepository operadoraRepository;
	
	@CrossOrigin(origins = "http://localhost:8085")
    @GetMapping("/buscarTodos")
	public Iterable<Operadora> buscarTotos() {
		return operadoraRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:8085")
    @GetMapping("/buscarPorId")
	public Operadora buscarPorId(@RequestParam(value="id") Long id) {
		return operadoraRepository.findOne(id);
	}
}
