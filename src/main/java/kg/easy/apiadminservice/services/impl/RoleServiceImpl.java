package kg.easy.apiadminservice.services.impl;

import kg.easy.apiadminservice.microservices.login_service.LoginServiceProxy;
import kg.easy.apiadminservice.models.Role;
import kg.easy.apiadminservice.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private LoginServiceProxy loginServiceProxy;
    @Override
    public List<Role> findAllRoles() {
        return loginServiceProxy.findRoles();
    }

    @Override
    public List<Role> findRolesByStatus(boolean active) {
        return loginServiceProxy.findRolesByStatus(active);
    }

    @Override
    public Role findRoleById(Long id) {
        return loginServiceProxy.findRoleById(id);
    }

    @Override
    public Role createRole(Role role) {
        return loginServiceProxy.createRole(role);
    }

    @Override
    public Role updateRole(Role role) {
        return loginServiceProxy.updateRole(role);
    }
}
