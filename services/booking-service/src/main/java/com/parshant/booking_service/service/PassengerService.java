package com.parshant.booking_service.service;


import com.parshant.Request.PassengerRequest;
import com.parshant.Response.PassengerResponse;
import com.parshant.booking_service.model.Passenger;
import com.parshant.exception.ResourceNotFoundException;

public interface PassengerService {

    PassengerResponse createPassenger(PassengerRequest request, Long userId)
            throws ResourceNotFoundException;

    Passenger findOrCreatePassengerEntity(PassengerRequest request, Long userId);

    Passenger findExistingPassenger(PassengerRequest request);

    boolean existsById(Long id);

    long count();
}
