package kg.easy.apiadminservice.services.impl;

import kg.easy.apiadminservice.mappers.UserMapper;
import kg.easy.apiadminservice.microservices.login_service.LoginServiceProxy;
import kg.easy.apiadminservice.models.User;
import kg.easy.apiadminservice.models.dto.UserDto;
import kg.easy.apiadminservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private LoginServiceProxy loginServiceProxy;

    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = UserMapper.INSTANCE.userDtoToUser(userDto);
        user = loginServiceProxy.save(user);
        return UserMapper.INSTANCE.userToUserDto(user);
    }

    @Override
    public UserDto updateUser(UserDto userDto) {

        User user = UserMapper.INSTANCE.userDtoToUser(userDto);
        user = loginServiceProxy.update(user);
        return UserMapper.INSTANCE.userToUserDto(user);
    }

    @Override
    public boolean deactivateUser(Long id) {
        return loginServiceProxy.delete(id);
    }

    @Override
    public UserDto findUserById(Long id) {
        return UserMapper.INSTANCE.userToUserDto(loginServiceProxy.getById(id));
    }

    @Override
    public List<UserDto> findAllUsers() {
        List<User> users = loginServiceProxy.findAllUsers();
        System.out.println(users);
        return users.stream()
                .map(x->UserMapper.INSTANCE.userToUserDto(x))
                .collect(Collectors.toList());
    }

    @Override
    public List<UserDto> findAllUsersByRole(Long roleId) {
        List<User> users =  loginServiceProxy.findAllUsersByRole(roleId);
        return users.stream()
                .map(x->UserMapper.INSTANCE.userToUserDto(x))
                .collect(Collectors.toList());
    }


}
