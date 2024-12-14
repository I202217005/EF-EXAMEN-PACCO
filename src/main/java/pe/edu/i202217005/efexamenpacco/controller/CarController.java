package pe.edu.i202217005.efexamenpacco.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.i202217005.efexamenpacco.entity.Car;
import pe.edu.i202217005.efexamenpacco.service.CarService;

import java.util.*;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/all")
    public List<Car> getAllCars() {
        return carService.findAll();
    }

    @GetMapping("/detail/{id}")
    public Optional<Car> getCarById(@PathVariable Integer id) {
        return carService.findById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        System.out.println("Received car: " + car);
        return ResponseEntity.ok(carService.save(car));
    }

    @PutMapping("/update")
    public Car updateCar(@RequestBody Car car) {
        return carService.save(car);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, String>> deleteCar(@PathVariable Integer id) {
        carService.deleteById(id);
        Map<String, String> response = new HashMap<>();
        response.put("status", "SUCCESS");
        response.put("message", "Car with ID " + id + " was successfully deleted");
        response.put("timestamp", new Date().toString());
        return ResponseEntity.ok(response);
    }
}