package com.parshant.payment_service.service;

import com.parshant.Request.PaymentInitiateRequest;
import com.parshant.Request.PaymentVerifyRequest;
import com.parshant.Response.PaymentDTO;
import com.parshant.Response.PaymentInitiateResponse;
import com.parshant.exception.PaymentException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface PaymentService {

    PaymentInitiateResponse initiatePayment(PaymentInitiateRequest request) throws PaymentException;

    PaymentDTO verifyPayment(PaymentVerifyRequest request) throws PaymentException;


    Page<PaymentDTO> getAllPayments(Pageable pageable);



    Map<Long, PaymentDTO> getPaymentsByBookingIds(List<Long> bookingIds);
}
