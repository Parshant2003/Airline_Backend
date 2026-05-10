package com.parshant.ancillary_service.mapper;

import com.parshant.Response.AncillaryResponse;
import com.parshant.Response.InsuranceCoverageResponse;
import com.parshant.ancillary_service.model.Ancillary;

import java.util.List;

public class AncillaryMapper {

    public static AncillaryResponse toResponse(
            Ancillary entity,
            List<InsuranceCoverageResponse> coverageResponseList) {
        if (entity == null) {
            return null;
        }

        return AncillaryResponse.builder()
                .id(entity.getId())
                .type(entity.getType())
                .subType(entity.getSubType())
                .rfisc(entity.getRfisc())
                .name(entity.getName())
                .description(entity.getDescription())
                .metadata(entity.getMetadata())
                .coverages(coverageResponseList)
                .displayOrder(entity.getDisplayOrder())
                .airlineId(entity.getAirlineId())
                .build();
    }
}
