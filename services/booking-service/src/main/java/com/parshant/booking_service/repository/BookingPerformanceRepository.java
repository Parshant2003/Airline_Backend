package com.parshant.booking_service.repository;

import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;

public interface BookingPerformanceRepository {

    // Booking Statistics
    Long countBookingsByFlightIdAndDateRange(Long flightId, LocalDateTime startDate, LocalDateTime endDate);

    Double sumRevenueByFlightIdAndDateRange(Long flightId, LocalDateTime startDate, LocalDateTime endDate);

    List<com.parshant.booking_service.model.Booking> findBookingsByFlightIdAndDateRange(
            Long flightId, LocalDateTime startDate, LocalDateTime endDate);
}
