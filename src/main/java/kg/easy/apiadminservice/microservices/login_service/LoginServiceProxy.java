package kg.easy.apiadminservice.microservices.login_service;

import kg.easy.apiadminservice.models.Role;
import kg.easy.apiadminservice.models.SessionInfo;
import kg.easy.apiadminservice.models.User;
import kg.easy.apiadminservice.models.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url = "${microservice.login-service-url}", value = "${microservice.login-service-name}")
public interface LoginServiceProxy {

    @GetMapping("/v1/session/auth")
    SessionInfo auth(@RequestParam String login, @RequestParam String password);

    @PostMapping("/v1/user/save")
    User save(@RequestBody User user);

    @PutMapping("/v1/user/update")
    User update(@RequestBody User user);

    @DeleteMapping("/v1/user/delete/{id}")
    boolean delete(@PathVariable Long id);

    @GetMapping("/v1/user/find/{id}")
    User getById(@PathVariable Long id);

    @GetMapping("/v1/user/all")
    List<User> findAllUsers();

    @GetMapping("/v1/user/list/{roleId}")
    List<User> findAllUsersByRole(@PathVariable Long roleId);




    @GetMapping("/v1/session/check")
    User checkSession(@RequestHeader("auth") String auth);


    @PostMapping("/api/v1/vehicle/add")
    Vehicle createVehicle(@RequestBody Vehicle vehicle);

    @PutMapping("/api/v1/vehicle/edit")
    Vehicle updateVehicle(@RequestBody Vehicle vehicleDto);

    @DeleteMapping("/api/v1/vehicle/delete/{id}")
    boolean deleteVehicle(@PathVariable Long id);

    @GetMapping("/api/v1/vehicle/list")
    List<Vehicle> findAll();

    @GetMapping("/api/v1/vehicle/{id}")
    Vehicle findById(@PathVariable Long id);

    @GetMapping("/api/v1/vehicle/list/{status}")
    List<Vehicle> findAllByStatus(@PathVariable boolean status);



    @GetMapping("/v1/role/all")
    List<Role> findRoles();

    @GetMapping("/v1/role/list")
    List<Role> findRolesByStatus(@RequestParam boolean active);

    @GetMapping("/v1/role/{id}")
    Role findRoleById(@PathVariable Long id);

    @PostMapping("/v1/role/create")
    Role createRole(@RequestBody Role roleDto);

    @PutMapping("/v1/role/edit")
    Role updateRole(@RequestBody Role roleDto);




}
