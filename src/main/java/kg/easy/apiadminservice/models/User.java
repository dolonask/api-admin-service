package kg.easy.apiadminservice.models;

import lombok.Data;

@Data
public class User {


    private Long id;

    private String name;
    private String address;
    private boolean active;
    private Role role;
    private Account account;
}
