package com.parshant.flight_ops_service.mapper;


import com.parshant.Request.FlightRequest;
import com.parshant.Response.AircraftResponse;
import com.parshant.Response.AirlineResponse;
import com.parshant.Response.AirportResponse;
import com.parshant.Response.FlightResponse;
import com.parshant.emuns.FlightStatus;
import com.parshant.flight_ops_service.model.Flight;

public class FlightMapper {

    public static Flight toEntity(FlightRequest request) {
        if (request == null) return null;
        return Flight.builder()
                .flightNumber(request.getFlightNumber())
                .aircraftId(request.getAircraftId())
                .departureAirportId(request.getDepartureAirportId())
                .arrivalAirportId(request.getArrivalAirportId())
                .status(request.getStatus() != null ? request.getStatus() : FlightStatus.SCHEDULED)
                .build();
    }

    public static FlightResponse toResponse(Flight flight,
                                            AircraftResponse aircraft,
                                            AirlineResponse airlineResponse,
                                            AirportResponse departureAirport,
                                            AirportResponse arrivalAirport) {
        if (flight == null) return null;
        return FlightResponse.builder()
                .id(flight.getId())
                .flightNumber(flight.getFlightNumber())
                .airline(airlineResponse)
                .aircraft(aircraft)
                .departureAirport(departureAirport)
                .arrivalAirport(arrivalAirport)
                .status(flight.getStatus())
                .createdAt(flight.getCreatedAt())
                .updatedAt(flight.getUpdatedAt())
                .build();
    }

    public static void updateEntity(FlightRequest request, Flight existing) {
        if (request == null || existing == null) return;
        if (request.getFlightNumber() != null) existing.setFlightNumber(request.getFlightNumber());
        if (request.getAirlineId() != null) existing.setAirlineId(request.getAirlineId());
        if (request.getAircraftId() != null) existing.setAircraftId(request.getAircraftId());
        if (request.getDepartureAirportId() != null) existing.setDepartureAirportId(request.getDepartureAirportId());
        if (request.getArrivalAirportId() != null) existing.setArrivalAirportId(request.getArrivalAirportId());
        if (request.getStatus() != null) existing.setStatus(request.getStatus());
    }
}
