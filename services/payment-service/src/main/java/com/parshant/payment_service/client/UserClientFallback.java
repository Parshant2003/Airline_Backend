package com.parshant.payment_service.client;

import com.parshant.dto.UserDTO;
import com.parshant.exception.UserException;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {

    @Override
    public UserDTO getUserById(Long userId) throws UserException {
        return null;
    }
}
