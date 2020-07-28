package kg.easy.apiadminservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class Role {

    @JsonIgnore
    private Long id;
    private String name;
    private boolean active;
}
