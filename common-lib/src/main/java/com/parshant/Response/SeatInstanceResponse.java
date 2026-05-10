package com.parshant.Response;


import com.parshant.emuns.CabinClassType;
import com.parshant.emuns.SeatAvailabilityStatus;

import lombok.*;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SeatInstanceResponse {
    private Long id;

    private Long flightId;
    private Long seatId;
    private String seatNumber;
    private String seatType;
    private String seatPosition;

    private SeatResponse seat;

    private Double price;

    private SeatAvailabilityStatus status;

    private Long flightInstanceId;

    private Boolean isBooked;

    private Long flightCabinId;
    private CabinClassType flightCabinClassType;

    private String mealPreference;
    private Double fare;

    private Long version;
    private Instant createdAt;
    private Instant updatedAt;

    private Boolean isAvailable;
    private Boolean isOccupied;
    private String seatCharacteristics;
}
