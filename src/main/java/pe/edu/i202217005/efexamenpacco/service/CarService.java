package pe.edu.i202217005.efexamenpacco.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.i202217005.efexamenpacco.entity.Car;
import pe.edu.i202217005.efexamenpacco.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Optional<Car> findById(Integer id) {
        return carRepository.findById(id);
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public void deleteById(Integer id) {
        carRepository.deleteById(id);
    }
}