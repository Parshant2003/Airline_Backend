package com.parshant.airline_core_service.service;

import com.parshant.Request.AirlineRequest;
import com.parshant.Response.AirlineDropdownItem;
import com.parshant.Response.AirlineResponse;
import com.parshant.emuns.AirlineStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AirlineService {

    // ----- CRUD -----
    AirlineResponse createAirline(AirlineRequest request, Long ownerId);
    AirlineResponse getAirlineByOwner(Long ownerId);
    AirlineResponse getAirlineById(Long id);
    Page<AirlineResponse> getAllAirlines(Pageable pageable);
    AirlineResponse updateAirline(AirlineRequest request, Long ownerId);
    void deleteAirline(Long id, Long ownerId);

    AirlineResponse changeStatusByAdmin(Long airlineId, AirlineStatus status);

    // ----- Dropdown -----
    List<AirlineDropdownItem> getAirlinesForDropdown();
}
