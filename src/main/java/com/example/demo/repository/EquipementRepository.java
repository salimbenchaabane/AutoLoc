package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Equipement;

public interface EquipementRepository extends JpaRepository<Equipement, Long> {

}
