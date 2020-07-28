package kg.easy.apiadminservice.models;

import lombok.Data;

@Data
public class Account {

    private Long id;
    private String login;
    private String password;
}
