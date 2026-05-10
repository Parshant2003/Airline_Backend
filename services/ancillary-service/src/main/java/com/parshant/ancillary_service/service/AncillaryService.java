package com.parshant.ancillary_service.service;


import com.parshant.Request.AncillaryRequest;
import com.parshant.Response.AncillaryResponse;
import com.parshant.exception.ResourceNotFoundException;

import java.util.List;

public interface AncillaryService {

    AncillaryResponse create(Long userId, AncillaryRequest request) throws ResourceNotFoundException;

    AncillaryResponse getById(Long id) throws ResourceNotFoundException;

    List<AncillaryResponse> getAllByAirlineId(Long userId);

    AncillaryResponse update(Long id, AncillaryRequest request) throws ResourceNotFoundException;

    void delete(Long id);
}
