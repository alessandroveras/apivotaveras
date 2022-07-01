package br.edu.infnet.apivotaveras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apivotaveras.model.domain.Candidato;
import br.edu.infnet.apivotaveras.model.service.CandidatoService;

@Component
public class CandidatoLoader implements ApplicationRunner {

	@Autowired
	private CandidatoService candidatoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Candidato candidato = new Candidato();
		candidato.setNome("Alessandro Veras");
		candidato.setNumero(21);

		try {
			candidatoService.incluir(candidato);
			System.out.println("[SUCESSO] Inclusao realizada!!!");

		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}

}
