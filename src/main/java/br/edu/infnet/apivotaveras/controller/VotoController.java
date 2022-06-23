package br.edu.infnet.apivotaveras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apivotaveras.model.domain.Voto;
import br.edu.infnet.apivotaveras.model.service.VotoService;


@RestController
@RequestMapping(value = "/api/voto")
public class VotoController {

	@Autowired
	private VotoService votoService;
	
	@GetMapping(value = "/{idVoto}/listar")
	public Voto obterPorId(@PathVariable Integer idVoto) {

		return votoService.obterPorId(idVoto);
	}

	@GetMapping(value = "/listar")
	public List<Voto> obterLista() {

		return votoService.obterLista();
	}

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Voto voto) {

		votoService.incluir(voto);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {

		votoService.excluir(id);
	}

}
