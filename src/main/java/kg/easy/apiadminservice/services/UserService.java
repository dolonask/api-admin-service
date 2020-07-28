package kg.easy.apiadminservice.services;

import kg.easy.apiadminservice.models.User;
import kg.easy.apiadminservice.models.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto saveUser(UserDto userDto);

    UserDto updateUser(UserDto userDto);

    boolean deactivateUser(Long id);

    UserDto findUserById(Long id);

    List<UserDto> findAllUsers();

    List<UserDto> findAllUsersByRole(Long roleId);
}
