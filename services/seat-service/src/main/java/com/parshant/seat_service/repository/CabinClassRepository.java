package com.parshant.seat_service.repository;

import com.parshant.emuns.CabinClassType;
import com.parshant.seat_service.model.CabinClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CabinClassRepository extends JpaRepository<CabinClass, Long> {
    boolean existsByCode(String code);
    boolean existsByCodeAndAircraftId(String code, Long aircraftId);
    boolean existsByCodeAndAircraftIdAndIdNot(String code, Long aircraftId, Long id);
    List<CabinClass> findByAircraftId(Long aircraftId);

    CabinClass findByAircraftIdAndName(Long flightId, CabinClassType cabinClassType);
}
