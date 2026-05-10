package com.parshant.location_service.controller;

import com.parshant.location_service.service.CityService;
import com.parshant.Request.CityRequest;
import com.parshant.Response.CityResponse;
import com.parshant.Response.PageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cities")
public class CityController {
    private final CityService cityService;

    @PostMapping
    public ResponseEntity<CityResponse> createCity(@RequestBody CityRequest cityRequest) {
        try {
            CityResponse response = cityService.createCity(cityRequest);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<CityResponse> getCityById(@PathVariable Long id) {
        CityResponse response = cityService.getCityById(id);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<CityResponse> updateCity(@PathVariable Long id, @RequestBody CityRequest cityRequest) {
        try {
            CityResponse response = cityService.updateCity(id, cityRequest);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCity(@PathVariable Long id) throws Exception {


        cityService.deleteCityById(id);
        return ResponseEntity.noContent().build();  // 204 No Content
    }

    @GetMapping
    public ResponseEntity<PageResponse<CityResponse>> getAllCities(Pageable pageable) {
        Page<CityResponse> page = cityService.getAllCities(pageable);
        PageResponse<CityResponse> response = new PageResponse<>(
                page.getContent(),
                page.getNumber(),
                page.getSize(),
                page.getTotalElements(),
                page.getTotalPages(),
                page.isLast()
        );
        return ResponseEntity.ok(response);
    }

    @GetMapping("/search")
    public ResponseEntity<PageResponse<CityResponse>> searchCities(@RequestParam String keyword, Pageable pageable) {
        Page<CityResponse> page = cityService.searchCities(keyword, pageable);
        PageResponse<CityResponse> response = new PageResponse<>(
                page.getContent(),
                page.getNumber(),
                page.getSize(),
                page.getTotalElements(),
                page.getTotalPages(),
                page.isLast()
        );
        return ResponseEntity.ok(response);
    }

    @GetMapping("/country/{countryCode}")
    public ResponseEntity<PageResponse<CityResponse>> getCitiesByCountryCode(@PathVariable String countryCode, Pageable pageable) {
        Page<CityResponse> page = cityService.searchCitiesByCountryCode(countryCode, pageable);
        PageResponse<CityResponse> response = new PageResponse<>(
                page.getContent(),
                page.getNumber(),
                page.getSize(),
                page.getTotalElements(),
                page.getTotalPages(),
                page.isLast()
        );
        return ResponseEntity.ok(response);
    }

    @GetMapping("/exists/{cityCode}")
    public ResponseEntity<Map<String, Boolean>> cityExists(@PathVariable String cityCode) {
        Map<String, Boolean> response = new HashMap<>();
        response.put("exists", cityService.cityExists(cityCode));
        return ResponseEntity.ok(response);
    }
}