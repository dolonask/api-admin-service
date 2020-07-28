package kg.easy.apiadminservice.models;

import kg.easy.apiadminservice.models.enums.ClientStatus;
import lombok.Data;

import java.util.List;

@Data
public class Client {

    private Long id;

    private List<Phone> phones;
    private List<Address> addresses;
    private ClientStatus status;





}
