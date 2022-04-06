package com.dio_class.devweek.Repository;

import com.dio_class.devweek.Entity.Ocorrencia;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepo extends JpaRepository<Ocorrencia, Long>{
    
}
