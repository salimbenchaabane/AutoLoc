package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Employe;
import com.example.demo.domain.RoleEmploye;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

    List<Employe> findByAgence_IdAgence(Long idAgence);

    List<Employe> findByRole(RoleEmploye role);
}
