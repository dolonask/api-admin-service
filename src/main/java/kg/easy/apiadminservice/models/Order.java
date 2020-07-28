package kg.easy.apiadminservice.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Order {

    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy HH:mm", timezone = "Asia/Bishkek")
    private Date addDate;
    private double ransonSum;

    private List<OrderDetail> orderDetails;
    private OrderHistory orderHistory;


}
