package com.parshant.seat_service.service;



import com.parshant.Request.SeatRequest;
import com.parshant.Response.SeatResponse;

import java.util.List;

public interface SeatService {


    void generateSeats(Long seatMapId) throws Exception;
    SeatResponse getSeatById(Long id);
    List<SeatResponse> getAll();
    SeatResponse updateSeat(Long id, SeatRequest request);

}

