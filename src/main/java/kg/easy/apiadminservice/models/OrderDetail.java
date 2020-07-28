package kg.easy.apiadminservice.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class OrderDetail {

    @JsonIgnore
    private Long id;

    private Client recipient;

    private Client sender;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy HH:mm", timezone = "Asia/Bishkek")
    private Date estDate;

}
