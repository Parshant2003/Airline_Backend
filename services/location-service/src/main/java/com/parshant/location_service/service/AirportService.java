package com.parshant.location_service.service;


import com.parshant.Request.AirportRequest;
import com.parshant.Response.AirportResponse;
import com.parshant.exception.AirportException;
import com.parshant.exception.CityException;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;

public interface AirportService {

    AirportResponse createAirport(AirportRequest request) throws AirportException, CityException;
    List<AirportResponse> createBulkAirports(List<AirportRequest> requests) throws AirportException, CityException;
    AirportResponse getAirportById(Long id);

    List<AirportResponse> getAllAirports();
    AirportResponse updateAirport(Long id, AirportRequest request) throws AirportException, CityException;
    void deleteAirport(Long id) throws AirportException;
    List<AirportResponse> getAirportsByCityId(Long cityId);
}
