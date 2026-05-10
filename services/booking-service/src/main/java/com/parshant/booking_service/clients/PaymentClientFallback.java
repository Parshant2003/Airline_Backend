package com.parshant.booking_service.clients;


import com.parshant.Request.PaymentInitiateRequest;
import com.parshant.Response.PaymentDTO;
import com.parshant.Response.PaymentInitiateResponse;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Component
public class PaymentClientFallback implements PaymentClient {

    @Override
    public PaymentInitiateResponse initiatePayment(PaymentInitiateRequest request, Long userId) {
        return null;
    }

    @Override
    public PaymentDTO getPaymentByBookingId(Long bookingId) {
        return null;
    }

    @Override
    public Map<Long, PaymentDTO> getPaymentsByBookingIds(List<Long> bookingIds) {
        return Collections.emptyMap();
    }
}
