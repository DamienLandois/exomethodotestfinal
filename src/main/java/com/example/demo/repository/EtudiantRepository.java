package com.example.demo.repository;

import com.example.demo.entity.Etudiant;
import org.springframework.data.repository.CrudRepository;

public interface EtudiantRepository extends CrudRepository<Etudiant, Integer> {
}
