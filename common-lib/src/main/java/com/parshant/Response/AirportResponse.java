package com.parshant.Response;

import com.parshant.embeddable.Address;
import com.parshant.embeddable.Analytics;
import com.parshant.embeddable.GeoCode;
import lombok.Data;
import java.time.ZoneId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AirportResponse {

    private Long id;
    private String iataCode;
    private String name;
    private String detailedName;
    private ZoneId timeZone;
    private Address address;
    private CityResponse city;
    private GeoCode geoCode;
    private Analytics analytics;
}

