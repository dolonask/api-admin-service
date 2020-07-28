package kg.easy.apiadminservice.controllers;

import kg.easy.apiadminservice.models.Vehicle;
import kg.easy.apiadminservice.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/vehicle")
@CrossOrigin
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/add")
    public Vehicle createVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.addVehicle(vehicle);
    }

    @PutMapping("/edit")
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.updateVehicle(vehicle);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteVehicle(@PathVariable Long id){
        return vehicleService.deleteVehicle(id);
    }

    @GetMapping("/list")
    public List<Vehicle> findAll(){
        return vehicleService.findAll();
    }

    @GetMapping("/{id}")
    public Vehicle findById(@PathVariable Long id){
        return vehicleService.findById(id);
    }

    @GetMapping("/list/{status}")
    public List<Vehicle> findAllByStatus(@PathVariable boolean status){
        return vehicleService.findByStatus(status);
    }


}
