package com.parshant.flight_ops_service.service;

import com.parshant.Request.FlightScheduleRequest;
import com.parshant.Response.FlightScheduleResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;

public interface FlightScheduleService {

    FlightScheduleResponse createFlightSchedule(Long userId, FlightScheduleRequest request) throws Exception;
    FlightScheduleResponse getFlightScheduleById(Long id) throws Exception;

    List<FlightScheduleResponse> getFlightScheduleByAirline(Long userId);

    FlightScheduleResponse updateFlightSchedule(Long id, FlightScheduleRequest request) throws Exception;

    void deleteFlightSchedule(Long id);
}

