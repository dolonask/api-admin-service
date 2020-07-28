package kg.easy.apiadminservice.controllers;

import io.swagger.annotations.ApiOperation;
import kg.easy.apiadminservice.models.User;
import kg.easy.apiadminservice.models.dto.UserDto;
import kg.easy.apiadminservice.services.SessionService;
import kg.easy.apiadminservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private SessionService sessionService;

    @PostMapping("/save")
    @ApiOperation(value = "Создание пользователя")
    public UserDto saveUser(@RequestHeader("auth") String auth, @RequestBody UserDto userDto){
        User naviUser = sessionService.getUserByToken(auth);
        return userService.saveUser(userDto);
    }

    @PutMapping("/edit")

    @ApiOperation(value = "Редактирование пользователя")
    public UserDto updateUser(@RequestHeader("auth") String auth, @RequestBody UserDto userDto){
        User naviUser = sessionService.getUserByToken(auth);
        return userService.updateUser(userDto);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Удаление пользователя")
    public boolean delete(@PathVariable Long id){
        return userService.deactivateUser(id);
    }

    @GetMapping("/find/{id}")
    @ApiOperation(value = "Получение пользователя по ИД")
    public UserDto getById(@PathVariable Long id){
        return userService.findUserById( id);
    }

    @GetMapping("/all")
    @ApiOperation(value = "Получение всех пользователей")
    public List<UserDto> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/list/{roleId}")
    @ApiOperation(value = "Получение пользователей по роли")
    public List<UserDto> findAllUsersByRole(@PathVariable Long roleId){
        return userService.findAllUsersByRole(roleId);
    }


}
