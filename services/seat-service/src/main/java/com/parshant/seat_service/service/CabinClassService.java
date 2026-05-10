package com.parshant.seat_service.service;

import com.parshant.Request.CabinClassRequest;
import com.parshant.Response.CabinClassResponse;
import com.parshant.emuns.CabinClassType;

import java.util.List;

public interface CabinClassService {

    CabinClassResponse createCabinClass(CabinClassRequest request);
    List<CabinClassResponse> createCabinClasses(List<CabinClassRequest> requests);
    CabinClassResponse getCabinClassById(Long id);
    List<CabinClassResponse> getCabinClassesByAircraftId(
            Long aircraftId);
    CabinClassResponse getByAircraftIdAndName(Long aircraftId,
                                              CabinClassType name);
    CabinClassResponse updateCabinClass(Long id, CabinClassRequest request);
    void deleteCabinClass(Long id);
}
