package kg.easy.apiadminservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class Phone {

    @JsonIgnore
    private Long id;
    private String msisdn;
    private boolean active;


}
