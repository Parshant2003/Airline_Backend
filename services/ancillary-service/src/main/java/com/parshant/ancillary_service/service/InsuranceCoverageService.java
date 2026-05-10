package com.parshant.ancillary_service.service;



import com.parshant.Request.InsuranceCoverageRequest;
import com.parshant.Response.InsuranceCoverageResponse;
import com.parshant.exception.ResourceNotFoundException;

import java.util.List;

public interface InsuranceCoverageService {

    InsuranceCoverageResponse createCoverage(InsuranceCoverageRequest request) throws ResourceNotFoundException;

    List<InsuranceCoverageResponse> createCoveragesBulk(List<InsuranceCoverageRequest> requests) throws ResourceNotFoundException;

    InsuranceCoverageResponse updateCoverage(Long id, InsuranceCoverageRequest request) throws ResourceNotFoundException;

    void deleteCoverage(Long id) throws ResourceNotFoundException;

    InsuranceCoverageResponse getCoverageById(Long id) throws ResourceNotFoundException;

    List<InsuranceCoverageResponse> getCoveragesByAncillaryId(
            Long ancillaryId);

    List<InsuranceCoverageResponse> getActiveCoveragesByAncillaryId(
            Long ancillaryId);

    List<InsuranceCoverageResponse> getAllCoverages();
}
