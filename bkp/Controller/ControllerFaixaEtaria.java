package com.dio_class.devweek.Controller;

import java.util.List;
import java.util.Optional;

import com.dio_class.devweek.Entity.FaixaEtaria;
import com.dio_class.devweek.Repository.FaixaEtariaRepo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerFaixaEtaria {
    private final FaixaEtariaRepo fRepository;
    
    public ControllerFaixaEtaria(FaixaEtariaRepo fRepository){
        this.fRepository = fRepository;
    }

    @GetMapping("/faixaetaria")
    public ResponseEntity<?> findAllFaixaEtaria(){
        try{
            List<FaixaEtaria> listaFaixaEtaria = fRepository.findAll();
            if(listaFaixaEtaria.isEmpty()){
                return new ResponseEntity<>(listaFaixaEtaria, HttpStatus.NOT_FOUND);
            }    
            return new ResponseEntity<>(listaFaixaEtaria, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }      
    }
    
    @GetMapping("/faixaetaria/{id}")
    public ResponseEntity<FaixaEtaria> findByIdFaixaEtaria(@PathVariable Long id){
        try{
            Optional<FaixaEtaria> unidOptional = fRepository.findById(id);
            if(unidOptional.isPresent()){
                FaixaEtaria faixaEtariaUnid = unidOptional.get();
                return new ResponseEntity<>(faixaEtariaUnid, HttpStatus.OK);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @PostMapping("faixaetaria/novo")
    public FaixaEtaria newFaixaEtaria(@RequestBody FaixaEtaria newfaixa){
        return fRepository.save(newfaixa);
    }

    @DeleteMapping("/faixaetaria/remover/{id}")
    public void deleteFaixaEtaria(@PathVariable long id){
        fRepository.deleteById(id);
    }
    
}
