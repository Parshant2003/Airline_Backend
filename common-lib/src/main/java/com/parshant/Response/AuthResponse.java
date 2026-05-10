package com.parshant.Response;

import com.fasterxml.jackson.annotation.JsonInclude;

import com.parshant.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthResponse {
    private String jwt;
    private String message;
    private String title;
    private UserDTO user;
}
