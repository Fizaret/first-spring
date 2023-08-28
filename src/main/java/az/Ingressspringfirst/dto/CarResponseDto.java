package az.Ingressspringfirst.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
@Data
public class CarResponseDto {
    private Long id;

    private String model;

    private  String engine;

    private String carColor;

    @JsonFormat(pattern = "dd.MM.yyyy")

    private LocalDate year;

}
