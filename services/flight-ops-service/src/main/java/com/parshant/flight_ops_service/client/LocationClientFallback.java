package com.parshant.flight_ops_service.client;

import com.parshant.Response.AirportResponse;
import org.springframework.stereotype.Component;

@Component
public class LocationClientFallback implements LocationClient {

    @Override
    public AirportResponse getAirportById(Long id) {
        return null;
    }
}

