package br.edu.infnet.apivotaveras.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apivotaveras.model.domain.Candidato;

@Repository
public interface CandidatoRepository extends CrudRepository<Candidato, Integer> {
	
	@Query("from Candidato c where c.eleicao.id = :idEleicao")
	public List<Candidato> obterLista(Integer idEleicao);

}
