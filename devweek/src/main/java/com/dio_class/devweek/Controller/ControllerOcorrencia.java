package com.dio_class.devweek.Controller;

import java.util.List;
import java.util.Optional;

import com.dio_class.devweek.Entity.Ocorrencia;
import com.dio_class.devweek.Repository.OcorrenciaRepo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerOcorrencia {
    private final OcorrenciaRepo ocRepository;

    public ControllerOcorrencia(OcorrenciaRepo ocRepository){
        this.ocRepository = ocRepository;
    }

    @GetMapping("/ocorrencia")
    public ResponseEntity<List<Ocorrencia>> findOcorrencias(){
        List<Ocorrencia> listaOcorrencia = ocRepository.findAll();
        if(listaOcorrencia.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/ocorrencia/{id}")
    public ResponseEntity<Ocorrencia> findOcorrenciasById(@PathVariable Long id){
        Optional<Ocorrencia> ocorrenciaOptional = ocRepository.findById(id);
        if(ocorrenciaOptional.isPresent()){
            Ocorrencia ocorrenciaUnid = ocorrenciaOptional.get();
            return new ResponseEntity<>(ocorrenciaUnid, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @PostMapping("/ocorrencia/novo")
    public Ocorrencia newOcorrencia(@RequestBody Ocorrencia newOcorrencia){
        return ocRepository.save(newOcorrencia);
    }
}
