package com.parshant.airline_core_service.service;

import com.parshant.Request.AircraftRequest;
import com.parshant.Response.AircraftResponse;
import com.parshant.exception.ResourceNotFoundException;

import java.util.List;

public interface AircraftService {

    AircraftResponse getAircraftById(Long id) throws ResourceNotFoundException;

    List<AircraftResponse> listAllAircraftsByOwner(Long ownerId);

    AircraftResponse createAircraft(AircraftRequest request,
                                    Long ownerId) throws ResourceNotFoundException;

    AircraftResponse updateAircraft(Long id, AircraftRequest request, Long ownerId) throws ResourceNotFoundException;

    void deleteAircraft(Long id) throws ResourceNotFoundException;
}
