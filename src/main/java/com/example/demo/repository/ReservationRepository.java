package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Reservation;
import com.example.demo.domain.StatutReservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByClient_IdClient(Long idClient);

    List<Reservation> findByVehicule_IdVehicule(Long idVehicule);

    List<Reservation> findByStatut(StatutReservation statut);
}
