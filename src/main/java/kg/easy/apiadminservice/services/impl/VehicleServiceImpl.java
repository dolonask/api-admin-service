package kg.easy.apiadminservice.services.impl;

import kg.easy.apiadminservice.microservices.login_service.LoginServiceProxy;
import kg.easy.apiadminservice.models.Vehicle;
import kg.easy.apiadminservice.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private LoginServiceProxy loginServiceProxy;
    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return loginServiceProxy.createVehicle(vehicle);
    }

    @Override
    public Vehicle updateVehicle(Vehicle vehicle) {
        return loginServiceProxy.updateVehicle(vehicle);
    }

    @Override
    public List<Vehicle> findAll() {
        return loginServiceProxy.findAll();
    }

    @Override
    public boolean deleteVehicle(Long id) {
        return loginServiceProxy.deleteVehicle(id);
    }

    @Override
    public Vehicle findById(Long id) {
        return loginServiceProxy.findById(id);
    }

    @Override
    public List<Vehicle> findByStatus(boolean status) {
        return loginServiceProxy.findAllByStatus(status);
    }

}
