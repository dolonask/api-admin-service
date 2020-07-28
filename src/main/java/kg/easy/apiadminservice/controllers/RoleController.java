package kg.easy.apiadminservice.controllers;

import kg.easy.apiadminservice.models.Role;
import kg.easy.apiadminservice.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/role")
@CrossOrigin
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/all")
    public List<Role> findRoles(){
        return roleService.findAllRoles();
    }

    @GetMapping("/list")
    public List<Role> findRolesByStatus(@RequestParam boolean active){
        return roleService.findRolesByStatus(active);
    }

    @GetMapping("/{id}")
    public Role findRoleById(@PathVariable Long id){
        return roleService.findRoleById(id);
    }


    @PostMapping("/create")
    public Role createRole(@RequestBody Role role){
        return roleService.createRole(role);
    }

    @PutMapping("/edit")
    public Role updateRole(@RequestBody Role role){
        return roleService.updateRole(role);
    }

}
