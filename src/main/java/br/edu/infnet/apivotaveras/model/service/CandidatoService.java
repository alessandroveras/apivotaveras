package br.edu.infnet.apivotaveras.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apivotaveras.model.domain.Candidato;
import br.edu.infnet.apivotaveras.model.repository.CandidatoRepository;

@Service
public class CandidatoService {

	@Autowired
	private CandidatoRepository candidatoRepository;

	public void incluir(Candidato candidato) {
		
		candidatoRepository.save(candidato);
	}

	public void excluir(Integer id) {

		candidatoRepository.deleteById(id);
	}

	public List<Candidato> obterLista() {

		return (List<Candidato>) candidatoRepository.findAll();
	}

	public List<Candidato> obterLista(Integer idEleicao) {
		return (List<Candidato>) candidatoRepository.obterLista(idEleicao);
	}

	public Candidato obterPorId(Integer id) {
		
		return candidatoRepository.findById(id).orElse(null);
	}

}
