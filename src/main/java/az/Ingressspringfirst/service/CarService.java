package az.Ingressspringfirst.service;

import az.Ingressspringfirst.dto.CarRequestDto;
import az.Ingressspringfirst.dto.CarResponseDto;
import az.Ingressspringfirst.entity.Car;
import az.Ingressspringfirst.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService implements CarServiceImpl{
    private final ModelMapper modelMapper;
    private final CarRepository carRepository;
@Override
    public void createCar(CarRequestDto carRequestDto){
        Car car=modelMapper.map(carRequestDto,Car.class);
        carRepository.save(car);
    }
    @Override
    public CarRequestDto getCarById(Long id){
    Car car= carRepository.findById(id).orElseThrow(()->new RuntimeException());
    return modelMapper.map(car,CarRequestDto.class);
    }
}

