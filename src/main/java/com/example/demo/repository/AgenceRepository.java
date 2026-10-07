package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Agence;


public interface AgenceRepository extends JpaRepository<Agence, Long>{

}
