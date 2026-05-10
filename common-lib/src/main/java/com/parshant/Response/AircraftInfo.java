package com.parshant.Response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AircraftInfo {
    private String code;
    private String name;
    private String registration;
}
