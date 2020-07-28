package kg.easy.apiadminservice.models.dto;

import lombok.Data;

@Data
public class UserDto {

    private Long userId;
    private String userName;
    private String address;
    private boolean userActive;

    private Long roleId;
    private String roleName;
    private boolean roleActive;

    private Long accountId;
    private String login;
    private String password;

}
