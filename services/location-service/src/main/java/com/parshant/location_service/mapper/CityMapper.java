package com.parshant.location_service.mapper;

import com.parshant.location_service.model.City;
import com.parshant.Request.CityRequest;
import com.parshant.Response.CityResponse;

public class CityMapper {
    public static City toEntity(CityRequest cityRequest) {
        if(cityRequest == null) return null;
        return City.builder()
                .name(cityRequest.getName())
                .cityCode(cityRequest.getCityCode())
                .countryCode(cityRequest.getCountryCode())
                .countryName(cityRequest.getCountryName())
                .regionCode(cityRequest.getRegionCode())
                .timeZoneId(cityRequest.getTimeZoneOffset())
                .build();
    }

    public static CityResponse toResponse(City city) {
        if(city == null) return null;
        return CityResponse.builder()
                .id(city.getId())
                .name(city.getName())
                .cityCode(city.getCityCode())
                .countryCode(city.getCountryCode())
                .countryName(city.getCountryName())
                .regionCode(city.getRegionCode())
                .build();
    }

    public static City updateEntity(City city, CityRequest cityRequest) {
        if(city == null || cityRequest == null) return city;

        if(cityRequest.getName() != null) {
            city.setName(cityRequest.getName());
        }
        if(cityRequest.getCityCode() != null) {
            city.setCityCode(cityRequest.getCityCode());
        }
        if(cityRequest.getCountryCode() != null) {
            city.setCountryCode(cityRequest.getCountryCode());
        }
        if(cityRequest.getCountryName() != null) {
            city.setCountryName(cityRequest.getCountryName());
        }
        if(cityRequest.getRegionCode() != null) {
            city.setRegionCode(cityRequest.getRegionCode());
        }
        if(cityRequest.getTimeZoneOffset() != null) {
            city.setTimeZoneId(cityRequest.getTimeZoneOffset());
        }
        return city;
    }


}
