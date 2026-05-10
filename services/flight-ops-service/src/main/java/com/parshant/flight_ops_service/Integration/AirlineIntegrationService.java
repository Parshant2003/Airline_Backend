package com.parshant.flight_ops_service.Integration;


import com.parshant.Response.AircraftResponse;

public interface AirlineIntegrationService {
    Long getAirlineIdForUser(Long userId);
    AircraftResponse getAircraftById(Long aircraftId);
}
