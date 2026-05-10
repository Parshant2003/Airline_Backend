package com.parshant.location_service.service.Impl;


import com.parshant.location_service.mapper.CityMapper;
import com.parshant.location_service.model.City;
import com.parshant.location_service.repositories.CityRepository;
import com.parshant.location_service.service.CityService;
import com.parshant.Request.CityRequest;
import com.parshant.Response.CityResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;
    @Override
    public CityResponse createCity(CityRequest cityRequest) throws Exception {
        String city=cityRequest.getCityCode();
        if(cityRepository.existsByCityCode(city)){
             throw new Exception("City with this given City Code already existed");
        }
        City new_city= CityMapper.toEntity(cityRequest);
        cityRepository.save(new_city);
        return CityMapper.toResponse(new_city);
    }


    @Override
    public CityResponse getCityById(Long id) {
        return cityRepository.findById(id)
                .map(CityMapper::toResponse)
                .orElse(null);
    }

    @Override
    public CityResponse updateCity(Long id, CityRequest cityRequest) throws Exception {
        if (cityRequest == null) {
            throw new Exception("CityRequest cannot be null");
        }

        City city = cityRepository.findById(id)
                .orElseThrow(() -> new Exception("City not found with id: " + id));

        // Check cityCode uniqueness (excluding current)
        if ( cityRepository.existsByCityCode(city.getCityCode())) {
            throw new Exception("City code already exists");
        }

        CityMapper.updateEntity(city, cityRequest);
        city = cityRepository.save(city);
        return CityMapper.toResponse(city);
    }

    @Override
    public void deleteCityById(Long id)throws Exception {
        City city = cityRepository.findById(id)
                .orElseThrow(() -> new Exception("City not found with id: " + id));
        if (cityRepository.existsById(id)) {
            cityRepository.deleteById(id);
        }
    }


    @Override
    public Page<CityResponse> getAllCities(Pageable pageable) {
        return cityRepository.findAll(pageable)
                .map(CityMapper::toResponse);
    }

    @Override
    public Page<CityResponse> searchCities(String keyword, Pageable pageable) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return getAllCities(pageable);
        }
        return cityRepository.searchByKeyword(keyword, pageable)
                .map(CityMapper::toResponse);
    }

    @Override
    public Page<CityResponse> searchCitiesByCountryCode(String countryCode, Pageable pageable) {
        return cityRepository.findByCountryCode(countryCode, pageable)
                .map(CityMapper::toResponse);
    }

    @Override
    public boolean cityExists(String cityCode) {
        return cityRepository.existsByCityCode(cityCode);
    }

    @Override
    public boolean validateCityCode(String cityCode) {
        return cityCode != null && !cityCode.trim().isEmpty()
                && cityRepository.existsByCityCode(cityCode);
    }
}
