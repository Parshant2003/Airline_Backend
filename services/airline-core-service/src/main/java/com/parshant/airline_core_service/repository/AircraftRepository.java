package com.parshant.airline_core_service.repository;

import com.parshant.airline_core_service.model.Aircraft;
import com.parshant.airline_core_service.model.Airline;
import com.parshant.emuns.AircraftStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AircraftRepository extends JpaRepository<Aircraft, Long> {

    Optional<Aircraft> findByCode(String code);

    boolean existsByCode(String code);

    List<Aircraft> findByStatus(AircraftStatus status);

    List<Aircraft> findByAirline(Airline airline);

    List<Aircraft> findByAirlineAndStatus(Airline airline, AircraftStatus status);

    List<Aircraft> findByAirlineAndStatusAndIsAvailable(Airline airline, AircraftStatus status, Boolean isAvailable);

    List<Aircraft> findByModelContainingIgnoreCase(String model);

    List<Aircraft> findByNextMaintenanceDateBefore(LocalDate date);
}
