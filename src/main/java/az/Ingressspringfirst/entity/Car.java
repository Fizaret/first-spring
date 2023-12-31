package az.Ingressspringfirst.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@Data
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private  String engine;
    private String carColor;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate year;

}
