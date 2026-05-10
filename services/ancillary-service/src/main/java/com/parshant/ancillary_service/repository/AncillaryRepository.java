package com.parshant.ancillary_service.repository;

import com.parshant.ancillary_service.model.Ancillary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AncillaryRepository extends JpaRepository<Ancillary, Long> {

    List<Ancillary> findByAirlineId(Long airlineId);
}