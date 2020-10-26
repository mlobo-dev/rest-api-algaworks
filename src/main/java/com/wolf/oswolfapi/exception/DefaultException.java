package com.wolf.oswolfapi.exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class DefaultException {

    private Integer status;
    private String titulo;
    private LocalDateTime dataHora;
}
