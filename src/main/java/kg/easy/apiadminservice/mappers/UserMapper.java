package kg.easy.apiadminservice.mappers;

import kg.easy.apiadminservice.models.User;
import kg.easy.apiadminservice.models.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mappings({
            @Mapping(source = "user.id", target = "userId"),
            @Mapping(source = "user.name", target = "userName"),
            @Mapping(source = "user.active", target = "userActive"),

            @Mapping(source = "role.id", target = "roleId"),
            @Mapping(source = "role.name", target = "roleName"),
            @Mapping(source = "role.active", target = "roleActive"),

            @Mapping(source = "account.id", target = "accountId"),
            @Mapping(source = "account.login", target = "login"),
            @Mapping(source = "account.password", target = "password"),

    })
    UserDto userToUserDto(User user);

    User userDtoToUser(UserDto userDto);
}
