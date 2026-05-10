package com.parshant.ancillary_service.client;

import com.parshant.Response.AirportResponse;
import com.parshant.exception.AirportException;
import org.springframework.stereotype.Component;

@Component
public class LocationClientFallback implements LocationClient {

    @Override
    public AirportResponse getAirportById(Long id) throws AirportException {
        return null;
    }
}
