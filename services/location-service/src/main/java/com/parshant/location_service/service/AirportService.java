package com.parshant.location_service.service;

import com.parshant.Request.AirportRequest;
import com.parshant.Response.AirportResponse;

import java.util.List;

public interface AirportService {

    AirportResponse createAirport(AirportRequest request) throws Exception;
//    List<AirportResponse> createBulkAirports(List<AirportRequest> requests) throws Exception, CityException;

    AirportResponse getAirportById(Long id);

    List<AirportResponse> getAllAirports();

    AirportResponse updateAirport(Long id, AirportRequest request) throws Exception;

    void deleteAirport(Long id) throws Exception;

    List<AirportResponse> getAirportsByCityId(Long cityId);
}