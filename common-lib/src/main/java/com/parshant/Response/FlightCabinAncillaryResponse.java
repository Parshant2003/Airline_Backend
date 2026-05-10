package com.parshant.Response;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightCabinAncillaryResponse {
    private Long id;
    private Long flightId;
    private Long cabinClassId;
    private FlightCabinAncillaryResponse ancillary;
    private Boolean available;
    private Integer maxQuantity;
    private Double price;
    private String currency;
    private Boolean includedInFare;
}
