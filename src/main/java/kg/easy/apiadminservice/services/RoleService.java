package kg.easy.apiadminservice.services;

import kg.easy.apiadminservice.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAllRoles();

    List<Role> findRolesByStatus(boolean active);

    Role findRoleById(Long id);

    Role createRole(Role role);

    Role updateRole(Role role);
}
