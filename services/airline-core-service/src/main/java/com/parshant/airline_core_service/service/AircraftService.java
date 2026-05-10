package com.parshant.airline_core_service.service;


import com.parshant.Request.AircraftRequest;
import com.parshant.Response.AircraftResponse;

import java.util.List;

public interface AircraftService {

    AircraftResponse getAircraftById(Long id) throws Exception;

    List<AircraftResponse> listAllAircraftsByOwner(Long ownerId);

    AircraftResponse createAircraft(AircraftRequest request,
                                    Long ownerId) throws Exception;

    AircraftResponse updateAircraft(Long id, AircraftRequest request, Long ownerId) throws Exception;

    void deleteAircraft(Long id) throws Exception;
}

