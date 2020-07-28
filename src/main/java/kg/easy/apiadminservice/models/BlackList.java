package kg.easy.apiadminservice.models;

import lombok.Data;

import java.util.Date;

@Data
public class BlackList {

    private Long id;
    private Date addDate;
    private User user;
    private Client client;


}
