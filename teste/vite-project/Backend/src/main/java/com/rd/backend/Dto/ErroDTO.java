package com.rd.backend.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ErroDTO {

    private HttpStatus errorType;
    private String message;

}
