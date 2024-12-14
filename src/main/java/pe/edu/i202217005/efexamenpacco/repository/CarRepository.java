package pe.edu.i202217005.efexamenpacco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.i202217005.efexamenpacco.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
}