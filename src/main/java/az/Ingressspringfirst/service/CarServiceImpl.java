package az.Ingressspringfirst.service;

import az.Ingressspringfirst.dto.CarRequestDto;

public interface CarServiceImpl {
    void createCar(CarRequestDto carRequestDto);

    CarRequestDto getCarById(Long id);

}
