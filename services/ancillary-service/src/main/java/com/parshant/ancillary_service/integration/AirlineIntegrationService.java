package com.parshant.ancillary_service.integration;


import com.parshant.Response.AircraftResponse;

public interface AirlineIntegrationService {
    Long getAirlineIdForUser(Long userId);
    AircraftResponse getAircraftById(Long aircraftId);
}

