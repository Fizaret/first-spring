package az.Ingressspringfirst.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class CarRequestDto {

    private String model;
    private  String engine;
    private String carColor;

    private LocalDate year;
}
