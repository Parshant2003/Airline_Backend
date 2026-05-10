package com.parshant.ancillary_service.service;



import com.parshant.Request.MealRequest;
import com.parshant.Response.MealResponse;
import com.parshant.exception.ResourceNotFoundException;

import java.util.List;

public interface MealService {

    MealResponse create(Long userId, MealRequest request) throws ResourceNotFoundException;

    List<MealResponse> bulkCreate(Long userId, List<MealRequest> requests) throws ResourceNotFoundException;

    MealResponse getById(Long id) throws ResourceNotFoundException;

    List<MealResponse> getByAirlineId(Long userId);

    MealResponse update(Long userId, Long id, MealRequest request) throws ResourceNotFoundException;

    void delete(Long id) throws ResourceNotFoundException;

    MealResponse updateAvailability(Long id, Boolean available) throws ResourceNotFoundException;


}
