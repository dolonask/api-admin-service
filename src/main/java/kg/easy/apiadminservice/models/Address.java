package kg.easy.apiadminservice.models;

import lombok.Data;

@Data
public class Address {

    private Long id;

    private String street;
    private String house;
    private String flat;

    private String floor;
    private String intercom;
    private String description;

    private boolean active;
    private boolean main;

}
