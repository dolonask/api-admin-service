package kg.easy.apiadminservice.services;

import kg.easy.apiadminservice.models.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle addVehicle(Vehicle vehicle);

    Vehicle updateVehicle(Vehicle vehicle);

    List<Vehicle> findAll();

    boolean deleteVehicle(Long id);

    Vehicle findById(Long id);

    List<Vehicle> findByStatus(boolean status);
}
