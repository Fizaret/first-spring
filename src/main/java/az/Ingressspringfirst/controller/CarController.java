package az.Ingressspringfirst.controller;

import az.Ingressspringfirst.dto.CarRequestDto;
import az.Ingressspringfirst.service.CarServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/car")
@RequiredArgsConstructor
public class CarController {
    private final CarServiceImpl carServiceimpl;
@PostMapping()
    public void create(@RequestBody CarRequestDto carRequestDto){
    carServiceimpl.createCar(carRequestDto);
}
@GetMapping("/{id}")
    public CarRequestDto getCarById(@PathVariable Long id){
    return carServiceimpl.getCarById(id);

}
}
