package br.com.dyonne.screenmatch_frases.service;

import br.com.dyonne.screenmatch_frases.dto.FraseDTO;
import br.com.dyonne.screenmatch_frases.model.Frase;
import br.com.dyonne.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    //Injeta as dependencias do repositorio
    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
