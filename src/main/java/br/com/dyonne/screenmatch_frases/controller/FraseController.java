package br.com.dyonne.screenmatch_frases.controller;

import br.com.dyonne.screenmatch_frases.dto.FraseDTO;
import br.com.dyonne.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Indicar ao spring que esse é um controlador
@RestController
public class FraseController {

    // Injeta dependencias service | Boa pratica: Desacopla o repositorio
    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria() {
        return servico.obterFraseAleatoria();
    }
}
