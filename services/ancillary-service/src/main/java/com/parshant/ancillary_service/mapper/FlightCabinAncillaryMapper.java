package com.parshant.ancillary_service.mapper;


import com.parshant.Response.FlightCabinAncillaryResponse;
import com.parshant.Response.InsuranceCoverageResponse;
import com.parshant.ancillary_service.model.FlightCabinAncillary;

import java.util.List;

public class FlightCabinAncillaryMapper {
    public static FlightCabinAncillaryResponse toResponse(
            FlightCabinAncillary entity,
            List<InsuranceCoverageResponse> coverages) {
        if (entity == null) {
            return null;
        }

        return FlightCabinAncillaryResponse.builder()
                .id(entity.getId())
                .flightId(entity.getFlightId())
                .cabinClassId(entity.getCabinClassId())
                .ancillary(AncillaryMapper.toResponse(entity.getAncillary(), coverages))
                .available(entity.getAvailable())
                .maxQuantity(entity.getMaxQuantity())
                .price(entity.getPrice())
                .currency(entity.getCurrency())
                .includedInFare(entity.getIncludedInFare())
                .build();
    }
}
