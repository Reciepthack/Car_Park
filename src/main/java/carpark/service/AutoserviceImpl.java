package carpark.service;

import carpark.entity.Car;
import carpark.entity.Driver;

import java.util.List;

public interface AutoserviceImpl {
    List<Car> getAll();
    Car getById(long id);
    Car getByModelCar(Car model);
    Driver getDriverId(long id);

}
