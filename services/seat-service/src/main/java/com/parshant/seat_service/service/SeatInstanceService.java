package com.parshant.seat_service.service;


import com.parshant.Request.SeatInstanceRequest;
import com.parshant.Response.SeatInstanceResponse;
import com.parshant.emuns.SeatAvailabilityStatus;

import java.util.List;

public interface SeatInstanceService {

    SeatInstanceResponse createSeatInstance(SeatInstanceRequest request);
    SeatInstanceResponse getSeatInstanceById(Long id);
    List<SeatInstanceResponse> getSeatInstancesByFlightId(Long flightId);
    List<SeatInstanceResponse> getAvailableSeatsByFlightId(Long flightId);
    List<SeatInstanceResponse> getAllByIds(List<Long> Ids);
    SeatInstanceResponse updateSeatInstanceStatus(Long id, SeatAvailabilityStatus status);
    Long countAvailableByFlightId(Long flightId);
    Double calculateSeatPrice(List<Long> seatInstanceId);
}
