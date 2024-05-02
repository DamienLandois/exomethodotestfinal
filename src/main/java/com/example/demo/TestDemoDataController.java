package com.example.demo;

import com.example.demo.entity.Etudiant;
import com.example.demo.repository.EtudiantRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class TestDemoDataController {

    @Autowired
    private EtudiantRepository repository;

    @Test
    public void testCrudOperations() {
        Etudiant etudiant = new Etudiant();
        etudiant.setNom("Test");
        etudiant.setAge(25);

        // Create
        etudiant = repository.save(etudiant);
        assertThat(etudiant.getId()).isNotNull();

        // Read
        Etudiant found = repository.findById(etudiant.getId()).orElse(null);
        assertThat(found).isEqualTo(etudiant);

        // Update
        found.setAge(26);
        Etudiant updated = repository.save(found);
        assertThat(updated.getAge()).isEqualTo(26);

        // Delete
        repository.delete(updated);
        assertThat(repository.existsById(updated.getId())).isFalse();
    }
}
