package com.parshant.flight_ops_service.service;


import com.parshant.Request.FlightRequest;
import com.parshant.Response.FlightResponse;
import com.parshant.emuns.FlightStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface FlightService {

    FlightResponse createFlight(Long userId, FlightRequest request) throws Exception;
    List<FlightResponse> createFlights(Long userId, List<FlightRequest> requests) throws Exception;
    FlightResponse getFlightById(Long id);
    FlightResponse getFlightByNumber(String flightNumber) throws Exception;
    Page<FlightResponse> getFlightsByAirline(Long userId,
                                             Long departureAirportId,
                                             Long arrivalAirportId,
                                             Pageable pageable);
    FlightResponse updateFlight(Long id, FlightRequest request) throws Exception;
    FlightResponse changeStatus(Long id, FlightStatus status) throws Exception;
    void deleteFlight(Long id);

    Map<Long, FlightResponse> getFlightsByIds(List<Long> ids);
}
