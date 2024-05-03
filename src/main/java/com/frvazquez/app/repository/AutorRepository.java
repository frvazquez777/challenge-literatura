package com.frvazquez.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.frvazquez.app.entity.AutorEntity;

public interface AutorRepository extends JpaRepository<AutorEntity, Long> {

    @Query("SELECT a FROM AutorEntity a WHERE :anio between a.fechaNacimiento AND a.fechaFallecimiento")
    List<AutorEntity> findForYear(int anio);

}
